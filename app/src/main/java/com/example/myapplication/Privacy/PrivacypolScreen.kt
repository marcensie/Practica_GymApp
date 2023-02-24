package com.example.myapplication.Privacy


import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.myapplication.Privacy.components.MyProfilePageBarr
import com.example.myapplication.Privacy.components.PPText

@Composable
fun PrivacyPolicyScreen(navController: NavController){
    Column {
        MyProfilePageBarr(navController =  navController)
        PPText()
    }
}
