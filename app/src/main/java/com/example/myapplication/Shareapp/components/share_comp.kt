package com.example.myapplication.Shareapp.components

import android.content.Intent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.NavRoute
import com.example.myapplication.R


@Composable
fun Textshare(){
    Text(
        modifier = Modifier
            .padding(top = 100.dp),
        text = stringResource(id = R.string.share_app),
        textAlign = TextAlign.Center,
        color = Color.Gray,
        fontSize = 30.sp
    )
}

@Composable
fun ShareButton(){
    //val link = R.string.git_link
    val sentIntent : Intent = Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(
            Intent.EXTRA_TEXT,
            "https://github.com/marcensie/Practica_GymApp")
        type = "text/plain"
    }
    val shareIntent = Intent.createChooser(sentIntent,null)
    val context = LocalContext.current

    Column(
        Modifier
            .fillMaxWidth()
            .absolutePadding(10.dp, 150.dp, 10.dp, 0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            modifier = Modifier
                .height(60.dp)
                .width(150.dp),
            onClick = {
                context.startActivity(shareIntent)
            }
        ) {
            androidx.compose.material.Text(text = "Share")
        }
    }
}
@Composable
fun MyProfilePageBarr(navController: NavController){
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = Color.White,
    ) {
        Column() {
            Box(
                modifier = Modifier
                    .height(60.dp)
            ) {
                val contextForToast = LocalContext.current.applicationContext

                TopAppBar(
                    backgroundColor = Color.White,
                    title = { Text("")
                    },
                    navigationIcon = {
                        IconButton(onClick = {navController.navigate(route = NavRoute.ProfileScreen.route)}){
                            Icon(imageVector = Icons.Filled.ArrowBack,contentDescription = "")
                        }
                    },
                    elevation = 10.dp

                )
            }
        }
    }
}