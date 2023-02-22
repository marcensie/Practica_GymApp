package com.example.myapplication.Fullbody


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.Choice.components.Globals
import com.example.myapplication.Exercise.Components.Topbar
import com.example.myapplication.R
import com.example.myapplication.Fullbody.components.Day_box
import com.example.myapplication.Fullbody.components.Day_box_rest
import com.example.myapplication.Fullbody.components.Day_box_start
import com.example.myapplication.Fullbody.components.Top_image

@Composable
fun FullbodyScreen(navController: NavController) {

 var imgid = 0
 var ttl = "0"
    var cdes = "0"
   var clrs: List<Color> = listOf(Color(0xFFA39EC2), Color(0xFF3313FC))

    Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFE7E7E7))
        )
        {
            //////////////
            when (Globals.imagid) {
                1 -> {
                    imgid = R.drawable.full_body
                    ttl = stringResource(id = R.string.fbw)
                    cdes = "image1"
                    clrs = listOf(Color(0xFFA39EC2), Color(0xFF3313FC))
                }
                2 -> {
                    imgid = R.drawable.arm
                    ttl = stringResource(id = R.string.armw)
                    cdes = "image2"
                    clrs = listOf(Color(0xFF31286A), Color(0xFF05040B))
                }
                3 -> {
                    imgid = R.drawable.back
                    ttl = stringResource(id = R.string.bcw)
                    cdes = "image3"
                    clrs = listOf(Color(0xFFA15429), Color(0xFF3A6690))
                }
                4 -> {
                    imgid = R.drawable.leg
                    ttl = stringResource(id = R.string.legw)
                    cdes = "image4"
                    clrs = listOf(Color(0xFF283835), Color(0xFF265374))
                }
            }
            /////////////////////
            Topbar(navController =  navController)
            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.verticalScroll(
                    rememberScrollState()
                )
            ) {

                Top_image(
                    imageId = imgid,
                    //imageId = R.drawable.full_body,
                    title = ttl,
                    colors = clrs,
                    ContDesc = cdes,
                    navController =  navController,
                )
                Day_box_start(dayText = "Day 1", exerciseText = "9 Exercises",
                    navController =  navController)
                Day_box(dayText = "Day 2", exerciseText = "9 Exercises")
                Day_box(dayText = "Day 3", exerciseText = "8 Exercises")
                Day_box_rest(dayText = "Day 4", exerciseText = "Rest Day")
                Day_box(dayText = "Day 5", exerciseText = "9 Exercises")
                Day_box(dayText = "Day 6", exerciseText = "9 Exercises")
                Day_box_rest(dayText = "Day 7", exerciseText = "Rest Day")
            }
        }

}



