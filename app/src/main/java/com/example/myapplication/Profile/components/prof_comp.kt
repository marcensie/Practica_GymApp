package com.example.myapplication.Profile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.NavRoute
import com.example.myapplication.R

@Composable
fun Topbar(navController: NavController) {
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
                        text = stringResource(id = R.string.app_title),
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "profile",
                    modifier = Modifier.size(50.dp)
                        .clickable(onClick = { navController.navigate(
                            route = NavRoute.ChoiceScreen.route) })
                )
            }
        }
    }
}

@Composable
fun Button_model(iconId: Int, description:String,text: String,
                 navController: NavController,route:String){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, start = 5.dp, end = 5.dp) ,
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier
                .height(55.dp)
                .clickable(onClick = { navController.navigate(route = route)})
        ){
            Image(
                painter = painterResource(id = iconId),
                contentDescription = description,
                modifier = Modifier
                    .height(45.dp)
                    .width(40.dp)
                    .padding(top = 10.dp, start = 15.dp),
            )
            Text(
                text = "$text",
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(start = 50.dp,top = 13.dp)
            )
        }
    }
}

@Composable
fun ProfileBox() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(top = 20.dp, start = 5.dp, end = 5.dp) ,
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp
    ) {
        Column(
            //verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "User Box",
                modifier = Modifier
                    .height(120.dp)
                    .width(130.dp)
                    .padding(top = 10.dp)
            )
            Text("Hi,Name", fontSize = 30.sp,
                modifier = Modifier.padding(top= 5.dp))
        }
    }
}