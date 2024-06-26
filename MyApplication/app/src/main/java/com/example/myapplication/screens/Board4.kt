package com.example.myapplication.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myapplication.R



@Composable
//@Preview(showBackground = true)
fun Board4(navController: NavController) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            TextButton(onClick = { navController.navigate("Board5")}){
                Text(
                    text = "Завершить", fontSize = 20.sp, color = Color(0xFF57A9FF),
                    modifier = Modifier.padding(top = 30.dp, bottom = 50.dp, start = 25.dp)
                )
            }

            Image(painter = painterResource(id = R.drawable.plus), contentDescription = "", contentScale = ContentScale.FillWidth, modifier =  Modifier.padding(top = 30.dp))
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Мониторинг", fontSize = 20.sp, color = Color(0xFF00B712)
            )
            Text(
                text = "Наши врачи всегда наблюдают", fontSize = 14.sp, color = Color(0xFF939396),
                modifier = Modifier.padding(top = 33.dp)
            )
            Text(
                text = "за вашими показателями здоворья", fontSize = 14.sp, color = Color(0xFF939396),
                modifier = Modifier.padding(top = 3.dp)
            )
            Canvas(
                modifier = Modifier.fillMaxWidth()
            ) {
                drawCircle(style = Stroke(3f),  color = Color(0xFF57A9FF), radius = 25f, center = Offset(450f,200f))
                drawCircle(style = Stroke(3f),  color = Color(0xFF57A9FF), radius = 25f, center = Offset(550f,200f))
                drawCircle(style = Stroke(3f), color =  Color(0xFF57A9FF), radius = 25f, center = Offset(650f,200f))
                drawCircle(color =  Color(0xFF57A9FF), radius = 25f, center = Offset(650f,200f))
            }
        }
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column(modifier = Modifier.fillMaxSize(2f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)
            {
                Image(painter = painterResource(id = R.drawable.k3), contentDescription = "", contentScale = ContentScale.FillWidth, modifier = Modifier.width(263.dp))
            }
        }
    }
}