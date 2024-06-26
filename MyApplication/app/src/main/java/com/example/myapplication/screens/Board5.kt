package com.example.myapplication.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myapplication.R
import com.example.myapplication.ViewModelSmartLab
import com.example.myapplication.navigation.Screens


fun ValidationEmail(email: String): Boolean {
    val emailRegex = Regex("^\\S+@\\S+\\.\\S+\$")
    return emailRegex.matches(email)
}
//@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Board5(navController: NavController, viewModel: ViewModelSmartLab) {
    var knopColor by remember { mutableStateOf(Color(0xFFC9D4FB)) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFffffff))
            .padding(horizontal = 20.dp)

    )
    {

        Text(
            "🖐 Добро0 пожаловать!",
            fontSize = 31.sp,
            color = Color(0xFF000000),
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 103.dp)
        )

        Text(
            "Войдите, чтобы пользоваться функциями приложения",
            fontSize = 18.sp,
            color = Color(0xFF000000),
            modifier = Modifier
                .padding(top = 30.dp)
        )
        Spacer(modifier = Modifier.height(50.dp))
        Text(
            text = "Вход по E-mail",
            fontSize = 14.sp,
            color = Color(0xFF7E7E9A),
            modifier = Modifier.padding(bottom = 6.dp)
        )
        //OutlinedTextField(
        val email = remember { mutableStateOf("") }

        TextField(
            email.value,
            { email.value = it },
            // value = "example@mail.ru", onValueChange = {},
            modifier = Modifier.fillMaxWidth(1f),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            textStyle = TextStyle(color = Color.Black),
            shape = RoundedCornerShape(60),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0XFFF5F5F9),
                focusedIndicatorColor = Color(0xFFEBEBEB),
                focusedTextColor = Color(0XFF578FFF),
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color(0XFF578FFF),
                focusedSupportingTextColor = Color(0xFF00000)
            ),
            placeholder = { Text("example@mail.ru") }
        )

        Button(
            onClick = {
                viewModel.sendCodeEmail(email.value)
                navController.navigate(Screens.Board6.route)
            },
            modifier = Modifier
                .padding(top = 26.dp)
                .width(335.dp)
                .height(56.dp),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = knopColor,
                contentColor = Color.White
            ),
        )

        {
            Text(text = "Далее", fontSize = 20.sp, color = Color(0xFFffffff))
        }
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(
            "Или войдите с помощью",
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 80.dp, 0.dp, 15.dp),
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            color = Color(0xFF939396)
        )
        Button(
            onClick = {},
            modifier = Modifier
                .padding(bottom = 56.dp)

                .fillMaxWidth(1f)
                .height(55.dp),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFffffff)),
            border = BorderStroke(
                1.dp, color = Color(0xFFEBEBEB)
            )
        ) {
            Text(
                text = "Войти с Яндекс", fontSize = 20.sp,
                color = Color(0xFF000000),
                fontWeight = FontWeight.Bold
            )
        }
    }
}