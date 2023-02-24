package com.example.myapplication.Contact


import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.myapplication.Contact.components.ContactText
import com.example.myapplication.Contact.components.TestProjectTheme
import com.example.myapplication.GlobalComponents.MyProfilePageBarr


@Composable
fun ContactUsScreen(navController: NavController){
    Column {
        MyProfilePageBarr(navController =  navController)
        ContactText()
        TestProjectTheme()
    }
}
