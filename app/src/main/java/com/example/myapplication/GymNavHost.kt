package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.About.AboutUsScreen
import com.example.myapplication.Choice.ChoiceScreen
import com.example.myapplication.Contact.ContactUsScreen
import com.example.myapplication.Exercise.ExerciseScreen
import com.example.myapplication.Fullbody.FullbodyScreen
import com.example.myapplication.Privacy.PrivacyPolicyScreen
import com.example.myapplication.Profile.ProfileScreen
import com.example.myapplication.Profile_BMI.BMIprofScreen
import com.example.myapplication.RateApp.RateAppScreen
import com.example.myapplication.Shareapp.ShareAppScreen


sealed class NavRoute(val route: String){
    object ChoiceScreen:NavRoute("choice_screen")
    object ExerciseScreen:NavRoute("exercise_screen")
    object FullbodyScreen:NavRoute("fullbody_screen")
    object ProfileScreen:NavRoute("profile_screen")
    object BMIprofScreen:NavRoute("bmi_prof_screen")
    object ContactUsScreen:NavRoute("contact_us_screen")
    object AboutUsScreen:NavRoute("about_us_screen")
    object ShareAppScreen:NavRoute("share_app_screen")
    object RateAppScreen:NavRoute("rate_app_screen")
    object PrivacyPolicyScreen:NavRoute("privacy_policy_screen")
    object Loading_bar:NavRoute("Loading_bar")
    object Select_Your:NavRoute("Select_Your")
    object Your_BMI:NavRoute("Your_BMI")
}

@Composable
fun GymNavHost (){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavRoute.Loading_bar.route){
        composable(NavRoute.ChoiceScreen.route){ ChoiceScreen(navController = navController) }
        composable(NavRoute.ExerciseScreen.route){ ExerciseScreen(navController = navController)}
        composable(NavRoute.FullbodyScreen.route){ FullbodyScreen(navController = navController)}
        composable(NavRoute.ProfileScreen.route){ ProfileScreen(navController = navController)}
        composable(NavRoute.BMIprofScreen.route){ BMIprofScreen(navController = navController)}
        composable(NavRoute.ContactUsScreen.route){ ContactUsScreen(navController = navController)}
        composable(NavRoute.AboutUsScreen.route){ AboutUsScreen(navController = navController)}
        composable(NavRoute.ShareAppScreen.route){ ShareAppScreen(navController = navController)}
        composable(NavRoute.RateAppScreen.route){ RateAppScreen(navController = navController)}
        composable(NavRoute.PrivacyPolicyScreen.route){ PrivacyPolicyScreen(navController = navController)}
        composable(NavRoute.Loading_bar.route){ Loading_bar(navController = navController)}
        composable(NavRoute.Select_Your.route){ Select_Your(navController = navController)}
        composable(NavRoute.Your_BMI.route){ Your_BMI(navController = navController)}
    }
}