package com.example.myapplication.Shareapp

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.myapplication.Shareapp.components.MyProfilePageBarr
import com.example.myapplication.Shareapp.components.ShareButton
import com.example.myapplication.Shareapp.components.Textshare

@Composable
fun ShareAppScreen(navController: NavController){
    Column {
        MyProfilePageBarr(navController =  navController)
        Textshare()
        ShareButton()
    }
}

