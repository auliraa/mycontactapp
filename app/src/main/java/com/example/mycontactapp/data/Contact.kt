package com.example.mycontactapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

// Menentukan nama tabel
@Entity(tableName = "contacts")
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val phoneNumber: String,
    val email: String // Field ke-3 sesuai syarat
)