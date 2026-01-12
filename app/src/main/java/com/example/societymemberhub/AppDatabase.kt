package com.example.societymemberhub
import androidx.room.RoomDatabase


import androidx.room.Database


@Database(
    entities = [Member::class, Announcemnt::class],
    version = 2
)

abstract class AppDatabase: RoomDatabase() {
    abstract fun memberDao(): MemberDao
    abstract fun announcementDao(): AnnouncementDao
}