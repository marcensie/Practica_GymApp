package com.example.myapplication.About

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.myapplication.About.components.DeveloperBox
import com.example.myapplication.GlobalComponents.MyProfilePageBarr


@Composable
fun AboutUsScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()) {

        MyProfilePageBarr(navController = navController)

        Box(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
        ){
            Column() {
                DeveloperBox(
                    title = "",
                )
            }
        }
    }
}



