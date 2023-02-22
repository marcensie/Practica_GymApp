package com.example.myapplication.Choice

import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.clickable
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavOptions
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.Choice.components.topbar
import com.example.myapplication.Choice.components.workout_type
import com.example.myapplication.NavRoute
import com.example.myapplication.R


//@Preview (showBackground = true)
//@Composable
//fun Choicepage(){
//    Choicep(navController =  rememberNavController())
//}

@Composable
fun ChoiceScreen(navController: NavHostController){
    Column(
        modifier =
        Modifier
            .background(Color(0xFFE7E7E7))
            .fillMaxSize(),
    ) {

        topbar(navController =  navController)

        Box(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Column() {

                workout_type(
                    imageId = R.drawable.full_body,
                    title = "FULL BODY\n WORKOUT",
                    colors = listOf(Color(0xFFA39EC2), Color(0xFF3313FC)),
                    ContDesc = "image1",
                    navController =  navController,
                    route = NavRoute.FullbodyScreen.route
                )
                workout_type(
                    imageId = R.drawable.arm,
                    title = "     ARM\n WORKOUT",
                    colors = listOf(Color(0xFF31286A), Color(0xFF05040B)),
                    ContDesc = "image2",
                    navController =  navController,
                    route = NavRoute.FullbodyScreen.route
                    //route = NavRoute.Armp.route
                )
                workout_type(
                    imageId = R.drawable.back,
                    title = "     BACK\n WORKOUT",
                    colors = listOf(Color(0xFFA15429), Color(0xFF3A6690)),
                    ContDesc = "image3",
                    navController =  navController,
                    route = NavRoute.FullbodyScreen.route
                   //route = NavRoute.Backp.route
                )
                workout_type(
                    imageId = R.drawable.leg,
                    title = "      LEG\n WORKOUT",
                    colors = listOf(Color(0xFF283835), Color(0xFF265374)),
                    ContDesc = "image4",
                    navController =  navController,
                    route = NavRoute.FullbodyScreen.route
                   // route = NavRoute.Legp.route
                )
            }
        }
    }
}

