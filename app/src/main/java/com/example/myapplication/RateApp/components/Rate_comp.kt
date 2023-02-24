package com.example.myapplication.RateApp.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R


@Composable
fun ThxText(){
    Text(
        modifier = Modifier
            .padding(top = 100.dp),
        text = stringResource(id = R.string.rate_app),
        textAlign = TextAlign.Center,
        color = Color.Gray,
        fontSize = 30.sp
    )
}

@Composable
fun Buttonrate(){
    val context = LocalContext.current
    val intent = remember{ Intent (Intent.ACTION_VIEW, Uri.parse("https://github.com/marcensie/Practica_GymApp")) }
    Column(Modifier.fillMaxWidth().absolutePadding(10.dp, 250.dp, 10.dp, 0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            modifier = Modifier.height(60.dp).width(150.dp),
            onClick = { context.startActivity(intent) }
        ) {
            Text(text = "Rate")
        }
    }
}