package com.example.myapplication.Exercise.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R


@Composable
fun Exercise(imageId: Int,title: String,number: String,ContDesc: String) {
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = ContDesc,
                modifier = Modifier.size(400.dp)
            )
            //navigation through exercises
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.back_b),
                    contentDescription = "left image",
                    modifier = Modifier
                        .size(50.dp)
                        .weight(1f)
                )
                Text(
                    text = "$title",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                )
                Image(
                    painter = painterResource(id = R.drawable.next_b),
                    contentDescription = "right image",
                    modifier = Modifier
                        .size(50.dp)
                        .weight(1f)
                )
            }
            //navigation through exercises end
            Text(
                text = "$number",
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp
            )
        }
    }
}
