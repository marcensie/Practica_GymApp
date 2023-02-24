package com.example.myapplication.RateApp


import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.myapplication.RateApp.components.Buttonrate
import com.example.myapplication.RateApp.components.MyProfilePageBarr
import com.example.myapplication.RateApp.components.ThxText


@Composable
fun RateAppScreen(navController:NavController){
    Column {
        MyProfilePageBarr(navController =  navController)
        ThxText()
        Buttonrate()
    }
}

