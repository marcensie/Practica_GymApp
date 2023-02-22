package com.example.myapplication.Exercise

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.myapplication.R
import com.example.myapplication.Exercise.Components.*


//@Preview (showBackground = true)
//@Composable
//fun ExerciseScreen(){
//    ExerciseScreen(navController =  rememberNavController())
//}


@Composable
fun ExerciseScreen(navController: NavController) {
    Column(
        modifier =
        Modifier
            .background(Color(0xFFE7E7E7))
            .fillMaxSize(),
    ) {
        Topbar(navController =  navController)

       Back_button(navController =  navController)

        Exercise(
            imageId = R.drawable.push_up,
            title = "Push Ups",
            number = "30",
            ContDesc = "push up image")
        Timer(totalTime = 10L * 1000L)

    }
}





