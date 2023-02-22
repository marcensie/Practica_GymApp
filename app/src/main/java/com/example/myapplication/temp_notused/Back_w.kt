package com.example.myapplication.temp_notused
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
//
//
//@Composable
//fun Backp(navController: NavController){
//        Column(modifier = Modifier
//            .fillMaxSize()
//            .background(Color(0xFFE7E7E7)))
//        {
//            topbar(navController =  navController)
//            Column(verticalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.verticalScroll(
//                rememberScrollState()
//            )) {
//                workout_type(
//                    imageId = R.drawable.back,
//                    title = "     BACK\n WORKOUT",
//                    colors =listOf(Color(0xFFA15429), Color(0xFF3A6690)),
//                    ContDesc ="image3" ,
//                    navController =  navController,
//                    route = NavRoute.Choicep.route
//                )
//                Day_box_start(dayText = "Day 1", exerciseText = "9 Exercises",navController =  navController)
//                Day_box(dayText = "Day 2", exerciseText = "9 Exercises")
//                Day_box(dayText = "Day 3", exerciseText = "8 Exercises")
//                Day_box_rest(dayText = "Day 4", exerciseText = "Rest Day")
//                Day_box(dayText = "Day 5", exerciseText = "9 Exercises")
//                Day_box(dayText = "Day 6", exerciseText = "9 Exercises")
//                Day_box_rest(dayText = "Day 7", exerciseText = "Rest Day")
//            }
//        }
//}