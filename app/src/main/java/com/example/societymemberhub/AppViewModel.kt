package com.example.societymemberhub

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

import kotlin.collections.emptyList


class AppViewModel(private val memberRepository: MemberRepository,
                   private val announcementRepository: AnnouncementRepository): ViewModel() {

    private val _members = MutableLiveData<List<Member>>(emptyList())


    private val _announcement = MutableLiveData<List<Announcemnt>>(emptyList())
    val announcements: LiveData<List<Announcemnt>> = announcementRepository.announcements


    val members: LiveData<List<Member>> = memberRepository.allMembers

    fun addMember(member: Member) {
        memberRepository.addMember(member)

    }

    fun addAnnouncement(announcemnt: Announcemnt) {
        viewModelScope.launch {
            announcementRepository.addAnnouncement(announcemnt)
        }

    }

    fun deleteMember(member: Member) {
        viewModelScope.launch {
            memberRepository.deleteMember(member)
        }
    }
    fun deleteAnnouncemet(announcemnt: Announcemnt){
        viewModelScope.launch {
            announcementRepository.deleteAnnouncement(announcemnt)
        }
    }
    fun editMember(member: Member) {
        if (!canEditMembers) return  // 🔒 ONLY ADMIN
        // update member logic here
    }

    private val _currentRole = mutableStateOf("Member")
    val currentRole: String
        get() = _currentRole.value
    fun setUserRole(role: String) {
        _currentRole.value = role
    }
    val canDeleteMembers: Boolean
        get() = _currentRole.value == "Admin"

    val canEditMembers: Boolean
        get() = _currentRole.value == "Admin"
    private val _selectedMember = mutableStateOf<Member?>(null)
    val selectedMember: Member?
        get() = _selectedMember.value

    fun selectMember(member: Member) {
        if (!canEditMembers) return   // admin only
        _selectedMember.value = member
    }
    fun updateMember(updatedMember: Member) {
        if (!canEditMembers) return

        viewModelScope.launch {
            memberRepository.updateMember(updatedMember)
        }
    }

    val canEditAnnouncement: Boolean
        get() = _currentRole.value == "Admin"

                   }