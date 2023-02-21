package com.example.myapplication

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun Bmip(navController: NavController){
    MainContent()
    UpperText()
    MyProfilePageBarr(navController =  navController)
}

@Composable
fun MainContent() {
    var showBmiResult by remember {
        mutableStateOf(false)
    }

    var bmiResult by remember {
        mutableStateOf(0.0)
    }

    Surface(modifier = Modifier.padding(12.dp)) {
        Column {
            BMICalculatorForm(onCalculateClicked = { weight, height ->
                bmiResult = calculateBMI(weight, height)
                showBmiResult = true
            }, onResetClicked = {
                bmiResult = 0.0
                showBmiResult = false
            })

            Spacer(modifier = Modifier.height(20.dp))

            BMIResultForm(showBmiResult, bmiResult)
        }
    }

}

@Composable
fun BMICalculatorForm(onCalculateClicked: (Double, Double) -> Unit, onResetClicked: () -> Unit) {
    var height by remember {
        mutableStateOf("")
    }

    var weight by remember {
        mutableStateOf("")
    }


    val validHeight = remember(height) {
        height.isNotEmpty()
    }

    val validWeight = remember(weight) {
        weight.isNotEmpty()
    }

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 200.dp),
        shape = RoundedCornerShape(CornerSize(8.dp)),
        border = BorderStroke(1.dp, color = Color.LightGray)
    ) {
        Column(
            modifier = Modifier.
            padding(start = 12.dp, end = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Adult BMI Calculator",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                style = MaterialTheme.typography.h5
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = height,
                onValueChange = { height = it },
                label = {
                    Text(
                        text = "Height in cms"
                    )
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Next
                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            OutlinedTextField(
                value = weight,
                onValueChange = { weight = it },
                label = {
                    Text(
                        text = "Weight in kgs"
                    )
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Done
                )
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    border = BorderStroke(1.dp, color = Color.LightGray),
                    onClick = {
                        if (!validHeight || !validWeight) return@Button
                        onCalculateClicked(weight.toDouble(), height.toDouble())
                    }) {
                    Text(
                        color = Color.Black,
                        text = "Calculate")
                }

                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    border = BorderStroke(1.dp, color = Color.LightGray),
                    onClick = {
                        weight = ""
                        height = ""
                        onResetClicked()
                    }) {
                    Text(
                        color = Color.Black,
                        text = "Reset")
                }

            }

        }
    }

}


@Composable
fun BMIResultForm(showBmi: Boolean = true, bmiValue: Double = 0.0) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(260.dp),
        shape = RoundedCornerShape(CornerSize(8.dp)),
        border = BorderStroke(1.dp, color = Color.LightGray)
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (showBmi) {
                val weightStatus = getWeightStatus(bmiValue)
                val bmiToDisplay = getFormattedBMI(bmiValue)
                Text(
                    text = "BMI: $bmiToDisplay",
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(weightStatus.color),
                    style = MaterialTheme.typography.h4
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Weight Status: ${weightStatus.value}",
                    fontWeight = FontWeight.Bold,
                    color = Color(weightStatus.color),
                    style = MaterialTheme.typography.h5
                )
            }
        }
    }
}

@Composable
fun UpperText(){
    Text(
        modifier = Modifier
            .padding(start = 100.dp, top = 120.dp, end = 100.dp, bottom = 50.dp)
            .fillMaxWidth(),
        text = "Here you can change information about your body",
        textAlign = TextAlign.Center,
        color = Color.Gray

    )
}


@Composable
fun MyProfilePageBarr(navController:NavController){
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
                        IconButton(onClick = {navController.navigate(route = NavRoute.Profilep.route)}){
                            Icon(imageVector = Icons.Filled.ArrowBack,contentDescription = "")
                        }
                    },
                    elevation = 10.dp

                )
            }
        }
    }
}