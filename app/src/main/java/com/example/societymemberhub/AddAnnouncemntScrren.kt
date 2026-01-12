package com.example.societymemberhub

import android.R.attr.name
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlin.text.isNotBlank

@Composable
fun AddAnnouncementScreen(appViewModel: AppViewModel,
                          navController: NavController){
    var title by remember { mutableStateOf(" ") }
    var message by remember { mutableStateOf(" ") }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text("Add New Announcement")
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = title,
            onValueChange = {newValue ->
                title = newValue },
            singleLine = true,
            label = {Text("Title")},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = message,
            onValueChange = {newValue ->
                message = newValue},
            singleLine = true,
            label = {Text("Message ?")},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            if (title.isNotBlank()&&message.isNotBlank()){
                val announcemnt= Announcemnt(
                    title = title,
                    message =  message
                )

                appViewModel.addAnnouncement(announcemnt)
                navController.popBackStack()
            }
        }) {
            Text("Add Announcement")
        }

    }

}