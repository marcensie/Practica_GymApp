package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun Loading_bar(navController: NavHostController) {
    ///added delay
    ///check later
    val isLoadingFinished = remember { mutableStateOf(false) }
    val navigationCompleted = remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        delay(2000)
        isLoadingFinished.value = true
    }

    if (isLoadingFinished.value && !navigationCompleted.value) {
        navController.navigate(NavRoute.Select_Your.route)
        navigationCompleted.value = true
    }
    Surface(
        modifier = Modifier.fillMaxSize().
        clickable(onClick = { navController.navigate(
            route = NavRoute.Select_Your.route) }),
        color = MaterialTheme.colors.background
    ) {
        val image: Painter = painterResource(id = R.drawable.background_image)
        Image(
            painter = image,
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                contentAlignment = Alignment.TopCenter
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.logo_white),
                    contentDescription = "",
                    modifier = Modifier
                        .height(281.dp)
                        .width(250.dp)
                        .padding(top = 98.dp),
                    Alignment.TopCenter
                )
            }
            Box(contentAlignment = Alignment.Center)
            {
                Text(
                    text = stringResource(id = R.string.app_title),
                    fontSize = 45.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
            Box(modifier = Modifier.padding(top = 150.dp))
            { CustomLinearProgressBar() }
        }
    }
}
@Composable
private fun CustomLinearProgressBar(){
    Column(modifier = Modifier.fillMaxWidth()) {
        LinearProgressIndicator(
            //progress = 0.7f,
            modifier = Modifier
                .fillMaxWidth()
                .height(15.dp)
                .padding(horizontal = 70.dp),
            backgroundColor = Color.White,
            color = Color(0xFF747474),
        )
    }
}
