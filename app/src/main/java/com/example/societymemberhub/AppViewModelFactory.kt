package com.example.societymemberhub

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class AppViewModelFactory(
    private val memberRepository: MemberRepository,
    private val announcementRepository: AnnouncementRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AppViewModel::class.java)) {
            return AppViewModel(
                memberRepository,
                announcementRepository
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
