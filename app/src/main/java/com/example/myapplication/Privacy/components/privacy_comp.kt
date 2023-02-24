package com.example.myapplication.Privacy.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.NavRoute
import com.example.myapplication.R

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
@Composable
fun PPText(){
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp, start = 5.dp, end = 5.dp, bottom = 20.dp),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(2.dp, Color.LightGray),
        elevation = 5.dp
    ) {

        Text(
            modifier = Modifier
                .padding(start = 5.dp, end = 5.dp, top = 5.dp)
                .verticalScroll(rememberScrollState()),
            text = stringResource(id = R.string.privacy_policy),
        )

    }
}