package com.example.societymemberhub
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName ="members")
data class Member(
    @PrimaryKey(autoGenerate =true)
    val id: Int=0,
    val name: String,
    val role: String,
    val domain: String
)
