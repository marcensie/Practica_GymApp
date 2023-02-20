package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

sealed class NavRoute(val route: String){
    object Choicep:NavRoute("choice_page")
    object Exercisep:NavRoute("exercise_page")
    object Fullbodyp:NavRoute("fullbody_page")
    object Armp:NavRoute("arm_page")
    object Backp:NavRoute("back_page")
    object Legp:NavRoute("leg_page")
}

@Composable
fun GymNavHost (){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavRoute.Choicep.route){
        composable(NavRoute.Choicep.route){ Choicep(navController = navController)}
        composable(NavRoute.Exercisep.route){ Exercisep(navController = navController)}
        composable(NavRoute.Fullbodyp.route){ Fullbodyp(navController = navController)}
        composable(NavRoute.Armp.route){ Armp(navController = navController)}
        composable(NavRoute.Backp.route){ Backp(navController = navController)}
        composable(NavRoute.Legp.route){ Legp(navController = navController)}
    }
}