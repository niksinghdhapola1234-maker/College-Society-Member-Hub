package com.example.societymemberhub

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.NavController


@Composable
fun AnnouncementScreen(viewModel: AppViewModel ) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        val canDelete = viewModel.canDeleteMembers
        val announcements by viewModel.announcements.observeAsState(emptyList())

        Column(modifier = Modifier.fillMaxSize()) {

            Text(
                text = "Announcements",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp)
            )

            LazyColumn {
                items(announcements) { announcement ->
                    AnnouncementCard(
                        id = announcement.id.toString(),
                        title = announcement.title,
                        message = announcement.message,
                        canDelete=canDelete,
                        onDeleteClick = {
                            viewModel.deleteAnnouncemet(announcement)
                        }

                    )
                }
            }
        }
    }
}