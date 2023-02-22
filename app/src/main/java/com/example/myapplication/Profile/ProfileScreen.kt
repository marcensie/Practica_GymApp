package com.example.myapplication.Profile

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
import com.example.myapplication.NavRoute
import com.example.myapplication.Profile.components.Button_model
import com.example.myapplication.Profile.components.ProfileBox
import com.example.myapplication.Profile.components.topbar
import com.example.myapplication.R


@Composable
fun ProfileScreen(navController:NavController){
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
                    route = NavRoute.BMI_prof_Screen.route
                )
                //Spacer(modifier = Modifier.height(20.dp))
                Button_model(
                    iconId = R.drawable.reminder,
                    description = "Reminder Icon",
                    text = "Reminder",
                    navController = navController,
                    route = NavRoute.BMI_prof_Screen.route
                )
//                Button_model(
//                    iconId = R.drawable.free_icon_notification_4991422,
//                    description = "Reminder Icon",
//                    text = "Reminder",
//                    navController = navController,
//                    route = NavRoute.ProfileScreen.route
//
//                )
                Button_model(
                    iconId = R.drawable.star,
                    description = "Rate Icon",
                    text = "Rate our App",
                    navController = navController,
                    route = NavRoute.BMI_prof_Screen.route

                )
                Button_model(
                    iconId = R.drawable.share,
                    description = "Share Icon",
                    text = "Share our App",
                    navController = navController,
                    route = NavRoute.BMI_prof_Screen.route

                )
                Button_model(
                    iconId = R.drawable.contact,
                    description = "Contact Icon",
                    text = "Contact Us",
                    navController = navController,
                    route = NavRoute.BMI_prof_Screen.route
                )
                Button_model(
                    iconId = R.drawable.privacy,
                    description = "Privacy Icon",
                    text = "Privacy Policy",
                    navController = navController,
                    route = NavRoute.BMI_prof_Screen.route
                )
                Button_model(
                    iconId = R.drawable.info,
                    description = "Info Icon",
                    text = "About Us",
                    navController = navController,
                    route = NavRoute.BMI_prof_Screen.route
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}



