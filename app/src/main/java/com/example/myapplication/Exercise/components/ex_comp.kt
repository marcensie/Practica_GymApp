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
fun topbar(navController: NavController) {
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
                        text = "STRONG\n   MAN",
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "profile",
                    modifier = Modifier.size(50.dp)
                        .clickable(onClick = { navController.navigate(route = NavRoute.ProfileScreen.route) })
                )
            }
        }
    }
}

@Composable
fun back_button(navController:NavController) {
    Box(
        modifier = Modifier
            .size(50.dp)
            .clip(CircleShape)
            .background(Color.White)
            .clickable(onClick = { navController.navigate(route = NavRoute.ChoiceScreen.route) })
    ) {
        Image(
            painter = painterResource(id = R.drawable.back_b),
            contentDescription = "back button",
            modifier = Modifier.fillMaxSize()
        )
    }
}

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

@Composable
fun timer(totalTime: Long){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(modifier = Modifier.size(200.dp),
            contentAlignment = Alignment.Center
        ) {
            // var totalTime = 10L * 1000L
            val initialValue: Float = 1f
            var size by remember { mutableStateOf(IntSize.Zero) }
            var value by remember { mutableStateOf(initialValue) }
            var currentTime by remember { mutableStateOf(totalTime) }
            var isTimerRunning by remember { mutableStateOf(false) }

            LaunchedEffect(key1 = currentTime, key2 = isTimerRunning) {
                if(currentTime > 0 && isTimerRunning) {
                    delay(100L)
                    currentTime -= 100L
                    value = currentTime / totalTime.toFloat()
                }
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.size(200.dp)
                    .onSizeChanged {
                        size = it
                    }
            ) {
                Canvas(modifier = Modifier.size(200.dp)) {
                    drawArc(
                        color = Color.DarkGray,
                        startAngle = -215f,
                        sweepAngle = 250f,
                        useCenter = false,
                        size = Size(size.width.toFloat(), size.height.toFloat()),
                        style = Stroke(5.dp.toPx(), cap = StrokeCap.Round)
                    )
                    drawArc(
                        color = Color(0xFF0097FC),
                        startAngle = -215f,
                        sweepAngle = 250f * value,
                        useCenter = false,
                        size = Size(size.width.toFloat(), size.height.toFloat()),
                        style = Stroke(5.dp.toPx(), cap = StrokeCap.Round)
                    )
                    val center = Offset(size.width / 2f, size.height / 2f)
                    val beta = (250f * value + 145f) * (PI / 180f).toFloat()
                    val r = size.width / 2f
                    val a = cos(beta) * r
                    val b = sin(beta) * r
                    drawPoints(
                        listOf(Offset(center.x + a, center.y + b)),
                        pointMode = PointMode.Points,
                        color = Color(0xFF003355),
                        strokeWidth = (5.dp * 3f).toPx(),
                        cap = StrokeCap.Round
                    )
                }
                Text(
                    text = (currentTime / 1000L).toString(),
                    fontSize = 44.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Button(
                    onClick = {
                        if(currentTime <= 0L) {
                            currentTime = totalTime
                            isTimerRunning = true
                        } else {
                            isTimerRunning = !isTimerRunning
                        }
                    },
                    modifier = Modifier.align(Alignment.BottomCenter),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if (!isTimerRunning || currentTime <= 0L) {
                            Color(0xFF0067E4)
                        } else {
                            Color.Red
                        }
                    )
                ) {
                    Text(
                        text = if (isTimerRunning && currentTime >= 0L) "Stop"
                        else if (!isTimerRunning && currentTime >= 0L) "Start"
                        else "Restart"
                    )
                }
            }
        }
    }
}