package com.example.myapplication.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.unit.dp

import androidx.navigation.NavController

import com.example.myapplication.R





@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true)
@Composable
fun Board1(navController: NavController) {
    Box(

        modifier = Modifier.fillMaxSize(1f).background(
            Brush.linearGradient(
                colors = listOf(
                    Color(161, 202, 255),
                    Color(77, 156, 255),
                    Color(161, 202, 255)
                ),
                start = Offset(0f, Float.POSITIVE_INFINITY),
                end = Offset(Float.POSITIVE_INFINITY, 0f)
            )
        )
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(116, 200, 228),
                        Color(115, 213, 188),
                        Color(116, 200, 228)
                    )
                )
            )
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(98, 105, 240).copy(alpha = 0.05f),
                        Color(55, 64, 245).copy(alpha = 0.65f),
                        Color(34, 84, 245).copy(alpha = 1f),
                        Color(55, 64, 245,).copy(alpha = 0.65f),
                        Color(98, 105, 240,).copy(alpha = 0.05f)
                    )
                )
            )
    )

    {

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    TextButton(onClick = { navController.navigate("Board2") }) {

                    }

                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier.width(263.dp)
                    )
                }
            }
        }
    }
}