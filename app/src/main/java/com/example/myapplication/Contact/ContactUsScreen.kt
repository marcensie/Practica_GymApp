package com.example.myapplication.Contact


import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.myapplication.Contact.components.ContactText
import com.example.myapplication.Contact.components.MyProfilePageBarr
import com.example.myapplication.Contact.components.TestProjectTheme


@Composable
fun ContactUsScreen(navController: NavController){
    Column {
        MyProfilePageBarr(navController =  navController)
        ContactText()
        TestProjectTheme()
    }
}
