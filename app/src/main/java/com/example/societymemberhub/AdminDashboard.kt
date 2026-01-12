package com.example.societymemberhub

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.livedata.observeAsState

import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun AdminDashboardScreen(viewModel: AppViewModel,
                         navController: NavController
) { Surface(
    modifier = Modifier.fillMaxSize(),
    color = MaterialTheme.colorScheme.background
){
    val members by viewModel.members.observeAsState(emptyList())
    val memberCount = viewModel.members.observeAsState(emptyList())


    val announcemnts by viewModel.announcements.observeAsState(emptyList())

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Admin Dashboard", fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))

        Text("Total Members: ${memberCount.value.size}")
        Spacer(modifier = Modifier.height(16.dp))



        Row() {
            Column () {
                Button(onClick = { navController.navigate("add_announcement") }) {
                    Text("Add Announcement")
                }
                Spacer(modifier = Modifier.height(16.dp))

                Button(onClick = { navController.navigate("announcements") }) {
                    Text("announcement scrren")
                }
            }

        Column {
            Button(onClick = { navController.navigate("memberlist") }) {
                Text("member list")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("add_member") }) {
                Text("Add Member")
            }
            Spacer(modifier = Modifier.height(16.dp))



        }
        }
    }
}}


