package com.example.myapplication.Exercise.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.NavRoute
import com.example.myapplication.R
import kotlinx.coroutines.delay
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin



@Composable
fun exercise(imageId: Int,title: String,number: String,ContDesc: String) {
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
