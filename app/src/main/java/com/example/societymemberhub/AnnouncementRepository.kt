package com.example.societymemberhub

import androidx.lifecycle.LiveData

class AnnouncementRepository(
    private val announcementDao: AnnouncementDao ) {



    val announcements: LiveData<List<Announcemnt>> = announcementDao.getAllAnnouncements()

    suspend fun addAnnouncement(announcement: Announcemnt) {
       announcementDao.insertAnnouncement(announcement)
    }
    suspend fun deleteAnnouncement(announcemnt: Announcemnt){
        announcementDao.deleteAnnouncement(announcemnt)
    }
}