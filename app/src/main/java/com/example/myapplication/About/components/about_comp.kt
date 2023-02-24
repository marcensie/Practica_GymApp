package com.example.myapplication.About.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.NavRoute

@Composable
fun DeveloperBox(/*imageId: Int,*/title : String/*,contDesc: String*/){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, start = 20.dp, end = 20.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ){
        Box(
            modifier = Modifier
                .size(200.dp)
        ){
//            Image(
//                painter = painterResource(id = imageId),
//                contentDescription = contDesc,
//            )
            Text(
                text = title,
            )
        }
    }
}
@Composable
fun MyProfilePageBarr(navController: NavController){
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = Color.White,
    ) {
        Column() {
            Box(
                modifier = Modifier
                    .height(60.dp)
            ) {
                val contextForToast = LocalContext.current.applicationContext

                TopAppBar(
                    backgroundColor = Color.White,
                    title = { Text("")
                    },
                    navigationIcon = {
                        IconButton(onClick = {navController.navigate(route = NavRoute.ProfileScreen.route)}){
                            Icon(imageVector = Icons.Filled.ArrowBack,contentDescription = "")
                        }
                    },
                    elevation = 10.dp

                )
            }
        }
    }
}