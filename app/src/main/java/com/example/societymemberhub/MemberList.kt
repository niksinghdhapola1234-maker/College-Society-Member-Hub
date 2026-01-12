package com.example.societymemberhub

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text

import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


//private val Int.position: Any
////private val Int.role: Any
//private val Int.name: Any
//private val Int.id: Any

//private val Int.domain: Any
//private val Int.position: Any
//private val Int.role: Any
//private val Int.name: Any
//private val Int.id: Any



@Composable
fun MemberList (viewModel: AppViewModel,
                navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        val members by viewModel.members.observeAsState(emptyList())
        val canDelete = viewModel.canDeleteMembers
        val canEdit = viewModel.canEditMembers

        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "Members List",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp)
            )

            LazyColumn {
                items(members) { member ->
                  MessageCard(
                        id = member.id.toString(),
                        name = member.name,
                        role = member.role,
                        domain = member.domain,
                        canDelete = canDelete,
                        canEdit = canEdit,
                        onDeleteClick = {
                            viewModel.deleteMember(member)
                        },
                      onEditClick = {
                          viewModel.selectMember(member)
                          navController.navigate("edit_member")
                      }
                    )
                }


            }


        }


    }
}

