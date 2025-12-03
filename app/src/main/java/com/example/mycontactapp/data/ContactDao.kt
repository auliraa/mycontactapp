package com.example.mycontactapp.data

//DAO (Data Access Object)

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactDao {
    // Mengambil semua data, return Flow agar UI update otomatis [cite: 16]
    @Query("SELECT * from contacts ORDER BY name ASC")
    fun getAllContacts(): Flow<List<Contact>>

    // Menambah data, suspend agar berjalan di background thread [cite: 17]
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(contact: Contact)
}