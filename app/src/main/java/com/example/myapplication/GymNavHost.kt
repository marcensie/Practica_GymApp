package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.Exercise.ExerciseScreen
import com.example.myapplication.Choice.ChoiceScreen
import com.example.myapplication.Fullbody.FullbodyScreen
import com.example.myapplication.Profile.ProfileScreen
import com.example.myapplication.Profile_BMI.BMI_prof_Screen

sealed class NavRoute(val route: String){
    object ChoiceScreen:NavRoute("choice_screen")
    object ExerciseScreen:NavRoute("exercise_screen")
    object FullbodyScreen:NavRoute("fullbody_screen")
    object ProfileScreen:NavRoute("profile_screen")
    object BMI_prof_Screen:NavRoute("bmi_prof_screen")
}

@Composable
fun GymNavHost (){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavRoute.ChoiceScreen.route){
        composable(NavRoute.ChoiceScreen.route){ ChoiceScreen(navController = navController) }
        composable(NavRoute.ExerciseScreen.route){ ExerciseScreen(navController = navController)}
        composable(NavRoute.FullbodyScreen.route){ FullbodyScreen(navController = navController)}
        composable(NavRoute.ProfileScreen.route){ ProfileScreen(navController = navController)}
        composable(NavRoute.BMI_prof_Screen.route){ BMI_prof_Screen(navController = navController)}
    }
}