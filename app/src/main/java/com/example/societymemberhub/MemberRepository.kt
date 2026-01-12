package com.example.societymemberhub

import androidx.lifecycle.LiveData

class MemberRepository (
    private val memberDao: MemberDao
){


    val allMembers: LiveData<List<Member>> = memberDao.getAllMembers()


    fun addMember(member: Member){
        memberDao.insertMember(member)
    }
    suspend fun deleteMember(member: Member){
        memberDao.deleteMember(member)
    }
    suspend fun updateMember(member: Member) {
        memberDao.updateMember(member)
    }

}