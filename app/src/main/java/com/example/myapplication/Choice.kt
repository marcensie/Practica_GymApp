package com.example.myapplication

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


//@Preview (showBackground = true)
//@Composable
//fun Choicepage(){
//    Choicep(navController =  rememberNavController())
//}

@Composable
fun Choicep(navController: NavHostController){
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
                    route = NavRoute.Fullbodyp.route
                )
                workout_type(
                    imageId = R.drawable.arm,
                    title = "     ARM\n WORKOUT",
                    colors = listOf(Color(0xFF31286A), Color(0xFF05040B)),
                    ContDesc = "image2",
                    navController =  navController,
                    route = NavRoute.Fullbodyp.route
                    //route = NavRoute.Armp.route
                )
                workout_type(
                    imageId = R.drawable.back,
                    title = "     BACK\n WORKOUT",
                    colors = listOf(Color(0xFFA15429), Color(0xFF3A6690)),
                    ContDesc = "image3",
                    navController =  navController,
                    route = NavRoute.Fullbodyp.route
                   //route = NavRoute.Backp.route
                )
                workout_type(
                    imageId = R.drawable.leg,
                    title = "      LEG\n WORKOUT",
                    colors = listOf(Color(0xFF283835), Color(0xFF265374)),
                    ContDesc = "image4",
                    navController =  navController,
                    route = NavRoute.Fullbodyp.route
                   // route = NavRoute.Legp.route
                )
            }
        }
    }
}


@Composable
fun topbar(navController:NavController) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        elevation = 5.dp
    ) {
        Box() {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(60.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(5.dp)
                )
                Column() {
                    Text(
                        text = "STRONG\n   MAN",
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "profile",
                    modifier = Modifier.size(50.dp)
                        .clickable(onClick = { navController.navigate(route = NavRoute.Profilep.route) })
                )
            }
        }
    }
}

@Composable
fun workout_type(imageId: Int, title: String,colors: List<Color> , ContDesc: String,navController:NavController,route: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, start = 20.dp, end = 20.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clickable(onClick = {
                    when (title) {
                        "FULL BODY\n WORKOUT" -> Globals.imagid = 1
                        "     ARM\n WORKOUT" -> Globals.imagid = 2
                        "     BACK\n WORKOUT" -> Globals.imagid = 3
                        "      LEG\n WORKOUT" -> Globals.imagid = 4
                    }
                    navController.navigate(route = route)})
                .background(
                    brush = Brush.verticalGradient(
                        colors = colors
                    )
                )
        ) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = ContDesc,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "\n$title",
                fontSize = 25.sp,
                color = Color.White
            )
        }
    }
}

@Composable
fun top_image(imageId: Int, title: String,colors: List<Color> , ContDesc: String,navController:NavController/*,route: String*/) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp, start = 19.dp, end = 19.dp),
        shape = RoundedCornerShape(5.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clickable(onClick = { navController.navigate(route = NavRoute.Choicep.route)})
                .background(
                    brush = Brush.verticalGradient(
                        colors = colors
                    )
                )
        ) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = ContDesc,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "\n$title",
                fontSize = 25.sp,
                color = Color.White
            )
        }
    }
}