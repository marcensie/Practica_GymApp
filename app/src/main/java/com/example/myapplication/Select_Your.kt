package com.example.myapplication

import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

//@Preview(showBackground = true)
//@Composable
//fun Select_Yourpr(){
//    Select_Your(navController =  rememberNavController())
//}
@Composable
fun Select_Your(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        //color = MaterialTheme.colors.background
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
    main_box(navController =  navController)
}
}


@Composable
fun main_box(navController: NavController)
{
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(460.dp)
                .padding(top = 50.dp)
                .padding(horizontal = 40.dp),
            color = Color.White,
            shape = RoundedCornerShape(5.dp)
        ) {
            Text(
                "Select Your", modifier = Modifier
                    .padding(top = 20.dp),
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Box(modifier = Modifier.padding(top = 1.dp)) {
                    Divider(
                        color = Color.Black,
                        thickness = 2.dp,
                        modifier = Modifier
                            .padding(horizontal = 75.dp)
                            .padding(top = 48.dp),
                    )
                }
                Text(
                    text = "Height:",
                    color = Color.Black,
                    modifier = Modifier
                        .align(alignment = Alignment.Start)
                        .padding(start = 45.dp, top = 7.dp),
                    fontSize = 11.sp,
                )
                data_box(text1 = "175", text2 = "cm" )
                Text(
                    text = "Weight:",
                    color = Color.Black,
                    modifier = Modifier
                        .align(alignment = Alignment.Start)
                        .padding(start = 45.dp),
                    fontSize = 11.sp,
                )
                data_box(text1 = "65", text2 = "   kg")
                Text(
                    text = "Select Your Age:",
                    color = Color.Black,
                    modifier = Modifier
                        .align(alignment = Alignment.Start)
                        .padding(start = 45.dp),
                    fontSize = 11.sp,
                )
                age_box()
                Box(modifier = Modifier.padding(top = 20.dp))
                continue_box(text3 = "Let's Start",navController =  navController)
            }
        }
    }
}

@Composable
fun data_box(
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
            .padding(horizontal = 20.dp)
            .width(200.dp),
        color = Color.White,
    )
    {
        Row(horizontalArrangement = Arrangement.spacedBy(150.dp)) {
            Text(
                text = text1,
                color = Color.Black,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(top = 15.dp),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = text2,
                color = Color.Black,
                textAlign = TextAlign.End,
                modifier = Modifier.padding(top = 15.dp),
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun age_box(
) {
    Surface(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RoundedCornerShape(30.dp),
            )
            .height(50.dp)
            .padding(horizontal = 20.dp)
            .width(200.dp),
        color = Color.White,
    )
    {
        Row(horizontalArrangement = Arrangement.End) {
            Image(painter = painterResource(id = R.drawable.calendar),
                modifier = Modifier
                    .padding(top = 15.dp)
                    .size(20.dp),
                contentDescription ="calendar"
            )
        }
    }
}

@Composable
fun continue_box(
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
            .padding(horizontal = 10.dp)
            .width(150.dp)
            .clickable(onClick = { navController.navigate(
                route = NavRoute.Your_BMI.route) }),
        color = Color.White,
    )
    {
        Text(text = text3,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            color = Color.Black,
            modifier = Modifier.padding(top = 15.dp))
    }
}