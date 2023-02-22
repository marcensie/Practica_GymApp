package com.example.myapplication.Fullbody.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.NavRoute
import com.example.myapplication.R

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
fun top_image(imageId: Int, title: String, colors: List<Color>, ContDesc: String, navController:NavController/*,route: String*/) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp, start = 19.dp, end = 19.dp),
        shape = RoundedCornerShape(5.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clickable(onClick = { navController.navigate(route = NavRoute.ChoiceScreen.route)})
                .background(
                    brush = Brush.verticalGradient(
                        colors = colors
                    )
                )
        ) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = ContDesc,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "\n$title",
                fontSize = 25.sp,
                color = Color.White
            )
        }
    }
}


@Composable
fun Day_box_start(dayText : String, exerciseText:String, navController:NavController
) {
    Surface(modifier = Modifier
        .fillMaxWidth()
        .height(65.dp)
        .padding(horizontal = 19.dp),
        shape = RoundedCornerShape(5.dp),
        Color.White
    )
    {
        Box(modifier = Modifier.fillMaxSize())
        {
            Column(verticalArrangement = Arrangement.spacedBy(1.dp)) {
                Text(
                    text = dayText, modifier = Modifier
                        .padding(top = 10.dp, start = 24.dp), fontSize = 20.sp
                )

                Text(
                    text = exerciseText, modifier = Modifier
                        .padding(start = 24.dp), fontSize = 15.sp
                )
            }

            Button( modifier = Modifier
                .align(Alignment.CenterEnd)
                .height(21.dp)
                .width(80.dp)
                .padding(end = 16.dp),
                shape = RoundedCornerShape(20.dp),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFb2adef)),
                onClick = { navController.navigate(route = NavRoute.ExerciseScreen.route)}
            ) {
                Text(text = "Start",
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun Day_box(
    dayText : String,
    exerciseText:String
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(65.dp)
            .padding(horizontal = 19.dp),
        shape = RoundedCornerShape(5.dp),
        Color.White
    )
    {
        Box(modifier = Modifier.fillMaxSize())
        {
            Column(verticalArrangement = Arrangement.spacedBy(1.dp)) {
                Text(
                    text = dayText, modifier = Modifier
                        .padding(top = 10.dp, start = 24.dp), fontSize = 20.sp
                )

                Text(
                    text = exerciseText, modifier = Modifier
                        .padding(start = 24.dp), fontSize = 15.sp
                )
            }
        }
    }
}

@Composable
fun Day_box_rest(
    dayText : String,
    exerciseText:String
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(65.dp)
            .padding(horizontal = 19.dp),
        shape = RoundedCornerShape(5.dp),
        Color.White
    )
    {
        Box(modifier = Modifier.fillMaxSize())
        {
            Column(verticalArrangement = Arrangement.spacedBy(1.dp)) {
                Text(
                    text = dayText, modifier = Modifier
                        .padding(top = 10.dp, start = 24.dp), fontSize = 20.sp
                )

                Text(
                    text = exerciseText, modifier = Modifier
                        .padding(start = 24.dp), fontSize = 15.sp
                )
            }
            Image(
                painter = painterResource(id = R.drawable.rest),
                contentDescription = "logo",
                modifier = Modifier
                    .size(35.dp)
                    .padding(end = 19.dp)
                    .align(alignment = Alignment.CenterEnd),

                )
        }
    }
}