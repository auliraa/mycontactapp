package com.example.mycontactapp.ui.theme

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.mycontactapp.data.Contact
import com.example.mycontactapp.data.ContactRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class ContactViewModel(private val repository: ContactRepository) : ViewModel() {

    // StateFlow berisi list kontak yang diamati oleh UI [cite: 24]
    val contactListState: StateFlow<List<Contact>> = repository.getAllContactsStream()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )

    // Fungsi untuk menyimpan data ke database [cite: 28]
    fun saveContact(name: String, phone: String, email: String) {
        viewModelScope.launch {
            val newContact = Contact(name = name, phoneNumber = phone, email = email)
            repository.insertContact(newContact)
        }
    }
}

// Factory untuk membuat ViewModel (boilerplate standard)
class ContactViewModelFactory(private val repository: ContactRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ContactViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ContactViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}