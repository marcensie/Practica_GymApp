package com.example.myapplication.Choice.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun Workout_type(
    imageId: Int,title: String,colors: List<Color>,ContDesc: String,
    navController: NavController,route: String)
{
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