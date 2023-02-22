package com.example.myapplication.Exercise.Components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun Timer(totalTime: Long){
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