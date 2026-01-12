package com.example.societymemberhub

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface AnnouncementDao {
    @Query("SELECT * FROM Announcemnt ORDER BY id DESC")
    fun getAllAnnouncements(): LiveData<List<Announcemnt>>

    @Insert
    suspend fun insertAnnouncement(announcemnt: Announcemnt)


    @Delete
    suspend fun deleteAnnouncement(announcemnt: Announcemnt)



}