package com.example.myapplication.Profile_BMI

import androidx.compose.runtime.*
import androidx.navigation.NavController
import com.example.myapplication.Profile_BMI.components.MainContent
import com.example.myapplication.Profile_BMI.components.MyProfilePageBarr
import com.example.myapplication.Profile_BMI.components.UpperText


@Composable
fun BMIprofScreen(navController: NavController){
    MainContent()
    UpperText()
    MyProfilePageBarr(navController =  navController)
}
