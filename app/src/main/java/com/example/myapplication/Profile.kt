package com.example.myapplication

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController


@Composable
fun Profilep(navController:NavController){
    Column(
        modifier = Modifier
            .background(Color(0xFFE7E7E7))
            .fillMaxSize()
    ) {

        topbar(navController =  navController)

        ProfileBox()

        Box(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ){
            Column() {
                Button_model(
                    iconId = R.drawable.profile,
                    description = "My Profile Image",
                    text = "My Profile",
                    navController = navController,
                    route = NavRoute.Bmip.route
                )
                //Spacer(modifier = Modifier.height(20.dp))
                Button_model(
                    iconId = R.drawable.reminder,
                    description = "Reminder Icon",
                    text = "Reminder",
                    navController = navController,
                    route = NavRoute.Bmip.route
                )
//                Button_model(
//                    iconId = R.drawable.free_icon_notification_4991422,
//                    description = "Reminder Icon",
//                    text = "Reminder",
//                    navController = navController,
//                    route = NavRoute.Profilep.route
//
//                )
                Button_model(
                    iconId = R.drawable.star,
                    description = "Rate Icon",
                    text = "Rate our App",
                    navController = navController,
                    route = NavRoute.Bmip.route

                )
                Button_model(
                    iconId = R.drawable.share,
                    description = "Share Icon",
                    text = "Share our App",
                    navController = navController,
                    route = NavRoute.Bmip.route

                )
                Button_model(
                    iconId = R.drawable.contact,
                    description = "Contact Icon",
                    text = "Contact Us",
                    navController = navController,
                    route = NavRoute.Bmip.route
                )
                Button_model(
                    iconId = R.drawable.privacy,
                    description = "Privacy Icon",
                    text = "Privacy Policy",
                    navController = navController,
                    route = NavRoute.Bmip.route
                )
                Button_model(
                    iconId = R.drawable.info,
                    description = "Info Icon",
                    text = "About Us",
                    navController = navController,
                    route = NavRoute.Choicep.route
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}



@Composable
fun Button_model(iconId: Int,description:String,text: String,navController: NavController,route:String){
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
