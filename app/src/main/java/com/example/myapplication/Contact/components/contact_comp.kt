package com.example.myapplication.Contact.components

import android.content.Intent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.navigation.NavController
import com.example.myapplication.NavRoute

@Composable
fun ContactText(){
    Text(
        modifier = Modifier
            .padding(top = 50.dp, bottom = 10.dp),
        text = stringResource(id = R.string.contact_us),
        textAlign = TextAlign.Center,
        color = Color.Gray,
        fontSize = 25.sp
    )
}
@Composable
fun TestProjectTheme() {
    Column(
    ) {
        openEmailer()
    }
}


@Composable
fun openEmailer() {
    val senderEmail = remember {
        mutableStateOf(TextFieldValue())
    }
    val emailSubject = remember {
        mutableStateOf(TextFieldValue())
    }
    val emailBody = remember {
        mutableStateOf(TextFieldValue())
    }
    val ctx = LocalContext.current

    Column(
        modifier = Modifier
            //.fillMaxSize()
            //.fillMaxHeight()
            .fillMaxWidth()
            .padding(start = 5.dp, end = 5.dp, top = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        TextField(
            value = senderEmail.value,
            onValueChange = { senderEmail.value = it },
            placeholder = { Text(text = "Enter sender email address") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = emailSubject.value,
            onValueChange = { emailSubject.value = it },
            placeholder = { Text(text = "Enter email subject") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = emailBody.value,
            onValueChange = { emailBody.value = it },
            placeholder = { Text(text = "Enter email body") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            val i = Intent(Intent.ACTION_SEND)
            val emailAddress = arrayOf(senderEmail.value.text)
            i.putExtra(Intent.EXTRA_EMAIL,emailAddress)
            i.putExtra(Intent.EXTRA_SUBJECT,emailSubject.value.text)
            i.putExtra(Intent.EXTRA_TEXT,emailBody.value.text)

            i.setType("message/rfc822")

            ctx.startActivity(
                Intent.createChooser(i,"Choose an Email client : ")
            )

        }) {
            Text(
                text = "Send Email",
                modifier = Modifier.padding(10.dp),
                color = Color.White,
                fontSize = 15.sp
            )
        }
    }
}