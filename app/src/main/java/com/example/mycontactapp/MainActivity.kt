package com.example.mycontactapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import com.example.mycontactapp.data.ContactDatabase
import com.example.mycontactapp.data.ContactRepository
import com.example.mycontactapp.ui.theme.ContactScreen
import com.example.mycontactapp.ui.theme.ContactViewModel
import com.example.mycontactapp.ui.theme.ContactViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val database = ContactDatabase.getDatabase(this)
        val repository = ContactRepository(database.contactDao())

        val viewModelFactory = ContactViewModelFactory(repository)
        val viewModel = ViewModelProvider(this, viewModelFactory)[ContactViewModel::class.java]

        setContent {
            ContactScreen(viewModel = viewModel)
        }
    }
}