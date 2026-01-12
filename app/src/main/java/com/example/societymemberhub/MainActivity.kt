package com.example.societymemberhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.societymemberhub.ui.theme.SocietyMemberHubTheme
import java.nio.file.WatchEvent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.room.Room


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

                SocietyMemberHubTheme {
                    val context = LocalContext.current
                    val db = Room.databaseBuilder(
                        context,
                        AppDatabase::class.java,
                        "society_db"
                    ).allowMainThreadQueries()
                        .build()
                    SocietyApp(db)

                }
            }

    }
}

@Composable
fun SocietyApp(database: AppDatabase){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {


        val memberRepository = MemberRepository(database.memberDao())
        val announcementRepository = AnnouncementRepository(database.announcementDao())

        val factory = AppViewModelFactory(
            memberRepository,
            announcementRepository
        )

        val appViewModel: AppViewModel = viewModel(factory = factory)

        val navController = rememberNavController()


        NavHost(navController = navController, startDestination = "role") {
            // role route id for the FirstScreen
            //admin_dashboard route id for the admin dashboard
            //member_dashboard route id for the member dashboard
            composable("role") {
                FirstScreen(
                    viewModel = appViewModel,
                    onAdimClick = { navController.navigate("admin_dashboard") },
                    onMemberClick = { navController.navigate("member_dashboard") }

                )
            }
            composable("admin_dashboard") {
                AdminDashboardScreen(
                    appViewModel,
                    navController = navController
                )
            }
            composable("member_dashboard") {
                MemberDashboardScreen(
                    appViewModel,
                    navController = navController
                )
            }
            composable("announcements") {
                AnnouncementScreen(appViewModel)
            }
            composable("memberlist") {
                MemberList(viewModel =appViewModel,
                    navController = navController)
            }
            composable("add_member") {
                AddMemberScreen(
                    appViewModel = appViewModel,
                    navController = navController
                )
            }
            composable("add_announcement") {
                AddAnnouncementScreen(
                    appViewModel = appViewModel,
                    navController = navController
                )
            }
            composable("edit_member") {
                EditMemberScreen(
                    viewModel = appViewModel,
                    navController = navController
                )
            }

        }
    }
}