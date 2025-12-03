package com.example.mycontactapp.data

//DAO (Data Access Object)

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactDao {

    @Query("SELECT * from contacts ORDER BY name ASC")
    fun getAllContacts(): Flow<List<Contact>>
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(contact: Contact)
}