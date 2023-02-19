package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

sealed class NavRoute(val route: String){
    object Choicep:NavRoute("choice_page")
    object Exercisep:NavRoute("exercise_page")

}

@Composable
fun GymNavHost (){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavRoute.Choicep.route){
        composable(NavRoute.Choicep.route){ Choicep(navController = navController)}
        composable(NavRoute.Exercisep.route){ Exercisep(navController = navController)}
    }
}