package com.example.societymemberhub

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface MemberDao {
    @Query("SELECT * FROM members")
    fun getAllMembers(): LiveData<List<Member>>

    @Insert
    fun insertMember(member: Member)

    @Delete
    suspend fun deleteMember(member: Member)
    @Update
    suspend fun updateMember(member: Member)
}