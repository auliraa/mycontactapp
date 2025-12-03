package com.example.mycontactapp.data

import kotlinx.coroutines.flow.Flow

class ContactRepository(private val contactDao: ContactDao) {
    fun getAllContactsStream(): Flow<List<Contact>> = contactDao.getAllContacts()

    suspend fun insertContact(contact: Contact) = contactDao.insert(contact)
}