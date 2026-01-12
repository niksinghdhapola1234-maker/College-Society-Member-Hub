package com.example.societymemberhub

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Announcemnt(
    @PrimaryKey(autoGenerate = true)
    val id: Int=0,
    val title: String,
    val message: String
)
