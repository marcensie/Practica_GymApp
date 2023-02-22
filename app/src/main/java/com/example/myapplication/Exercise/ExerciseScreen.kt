package com.example.myapplication.Exercise

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.clickable
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.IntSize
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.Exercise.components.back_button
import com.example.myapplication.Exercise.components.exercise
import com.example.myapplication.Exercise.components.timer
import com.example.myapplication.Exercise.components.topbar
import com.example.myapplication.NavRoute
import com.example.myapplication.R
import kotlinx.coroutines.delay
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin


//@Preview (showBackground = true)
//@Composable
//fun Exercisepage(){
//    Exercisep(navController =  rememberNavController())
//}


@Composable
fun ExerciseScreen(navController: NavController) {
    Column(
        modifier =
        Modifier
            .background(Color(0xFFE7E7E7))
            .fillMaxSize(),
    ) {
        topbar(navController =  navController)

       back_button(navController =  navController)

        exercise(
            imageId = R.drawable.push_up,
            title = "Push Ups",
            number = "30",
            ContDesc = "push up image")
        timer(totalTime = 10L * 1000L)

    }
}





