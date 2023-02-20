package com.example.myapplication


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController


@Composable
fun Fullbodyp(navController: NavController) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFE7E7E7))
        )
        {
            topbar(navController =  navController)
            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.verticalScroll(
                    rememberScrollState()
                )
            ) {
                workout_type(
                    imageId = R.drawable.full_body,
                    title = "FULL BODY\n WORKOUT",
                    colors = listOf(Color(0xFFA39EC2), Color(0xFF3313FC)),
                    ContDesc = "image1",
                    navController =  navController,
                    route = NavRoute.Choicep.route
                )
                Day_box_start(dayText = "Day 1", exerciseText = "9 Exercises",navController =  navController)
                Day_box(dayText = "Day 2", exerciseText = "9 Exercises")
                Day_box(dayText = "Day 3", exerciseText = "8 Exercises")
                Day_box_rest(dayText = "Day 4", exerciseText = "Rest Day")
                Day_box(dayText = "Day 5", exerciseText = "9 Exercises")
                Day_box(dayText = "Day 6", exerciseText = "9 Exercises")
                Day_box_rest(dayText = "Day 7", exerciseText = "Rest Day")
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
                onClick = { navController.navigate(route = NavRoute.Exercisep.route)}
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

