package com.example.societymemberhub

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun FirstScreen(
    onAdimClick:()-> Unit,
    onMemberClick:()-> Unit,
    viewModel: AppViewModel
){
    Column(modifier = Modifier.padding(8.dp).
    fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("College Society Member Hub",
            fontWeight = FontWeight.Bold
        )
        Text("Login as a :",
            fontWeight= FontWeight.Medium)
        Row (modifier = Modifier.padding(8.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly){
            Button(onClick = {
                onAdimClick()
                viewModel.setUserRole("Admin")
            },
                modifier = Modifier.weight(1f)) {
                Text("Admin")
            }
            Button(onClick = {
                onMemberClick()
                viewModel.setUserRole("Member")
            },
                modifier = Modifier.weight(1f)) {
                Text("Member")
            }
        }

    }
}