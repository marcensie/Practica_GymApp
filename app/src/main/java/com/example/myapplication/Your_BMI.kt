package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Your_BMI(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        val image: Painter = painterResource(id = R.drawable.background_image)
        Image(
            painter = image,
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize()
                .blur(2.dp),
            contentScale = ContentScale.Crop
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                contentAlignment = Alignment.TopCenter
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.logo_white),
                    contentDescription = "",
                    modifier = Modifier
                        .height(281.dp)
                        .width(250.dp)
                        .blur(2.dp)
                        .padding(top = 98.dp),
                    Alignment.TopCenter
                )
            }
        }
        main_box2(navController =  navController)
    }
}


@Composable
fun main_box2(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
                .padding(top = 20.dp)
                .padding(horizontal = 40.dp),
            color = Color.White,
            shape = RoundedCornerShape(5.dp)
        ) {
            Text(
                "Your BMI Index", modifier = Modifier
                    .padding(top = 20.dp),
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Box(modifier = Modifier.padding(top = 5.dp)) {
                    Divider(
                        color = Color.Black,
                        thickness = 2.dp,
                        modifier = Modifier
                            .padding(horizontal = 68.dp)
                            .padding(top = 48.dp),
                    )
                }
                Text(
                    text = "BMI Index:",
                    color = Color.Black,
                    modifier = Modifier
                        .align(alignment = Alignment.Start)
                        .padding(start = 45.dp, top = 7.dp),
                    fontSize = 12.sp,
                )
                data_box1(text1 = "27kg/m^2", text2 = "")
                Box(modifier = Modifier.padding(top = 50.dp))
                continue_box2(text3 = "Open App",navController =  navController)
            }
        }
    }
}
@Composable
fun data_box1(
    text1:String,
    text2:String,
) {
    Surface(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RoundedCornerShape(30.dp),
            )
            .height(50.dp)
            .padding(horizontal = 2.dp)
            .width(150.dp),
        color = Color.White,
    )
    {
        Text(text = text1,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            color = Color.Black,
            modifier = Modifier.padding(top = 12.dp))
    }
}
@Composable
fun continue_box2(
    text3:String, navController: NavController
) {
    Surface(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RoundedCornerShape(30.dp),
            )
            .height(50.dp)
            .padding(horizontal = 25.dp)
            .width(150.dp)
            .clickable(onClick = { navController.navigate(
                route = NavRoute.ChoiceScreen.route) }),
        color = Color.White,
    )
    {
        Text(text = text3,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            color = Color.Black,
            modifier = Modifier.padding(top = 12.dp))
    }
}