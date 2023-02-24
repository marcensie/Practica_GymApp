package com.example.myapplication.About.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

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
