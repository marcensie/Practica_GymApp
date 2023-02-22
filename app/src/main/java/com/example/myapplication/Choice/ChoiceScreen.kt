package com.example.myapplication.Choice


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.example.myapplication.NavRoute
import com.example.myapplication.R
import com.example.myapplication.Choice.components.Topbar
import com.example.myapplication.Choice.components.Workout_type


//@Preview (showBackground = true)
//@Composable
//fun ChoiceScreen(){
//    ChoiceScreen(navController =  rememberNavController())
//}

@Composable
fun ChoiceScreen(navController: NavHostController){
    Column(
        modifier =
        Modifier
            .background(Color(0xFFE7E7E7))
            .fillMaxSize(),
    ) {

        Topbar(navController =  navController)

        Box(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Column() {

                Workout_type(
                    imageId = R.drawable.full_body,
                    title = stringResource(id = R.string.fbw),
                    colors = listOf(Color(0xFFA39EC2), Color(0xFF3313FC)),
                    ContDesc = "image1",
                    navController =  navController,
                    route = NavRoute.FullbodyScreen.route
                )
                Workout_type(
                    imageId = R.drawable.arm,
                    title = stringResource(id = R.string.armw),
                    colors = listOf(Color(0xFF31286A), Color(0xFF05040B)),
                    ContDesc = "image2",
                    navController =  navController,
                    route = NavRoute.FullbodyScreen.route
                )
                Workout_type(
                    imageId = R.drawable.back,
                    title = stringResource(id = R.string.bcw),
                    colors = listOf(Color(0xFFA15429), Color(0xFF3A6690)),
                    ContDesc = "image3",
                    navController =  navController,
                    route = NavRoute.FullbodyScreen.route
                )
                Workout_type(
                    imageId = R.drawable.leg,
                    title = stringResource(id = R.string.legw),
                    colors = listOf(Color(0xFF283835), Color(0xFF265374)),
                    ContDesc = "image4",
                    navController =  navController,
                    route = NavRoute.FullbodyScreen.route
                )
            }
        }
    }
}

