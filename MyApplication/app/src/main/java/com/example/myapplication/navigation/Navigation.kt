package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ViewModelSmartLab
import com.example.myapplication.screens.Board1
import com.example.myapplication.screens.Board2
import com.example.myapplication.screens.Board3
import com.example.myapplication.screens.Board4
import com.example.myapplication.screens.Board5
import com.example.myapplication.screens.Board6


@Composable
fun Navigation (viewModel: ViewModelSmartLab) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.Board1.route)
    {
        composable(route = Screens.Board1.route)
        {
            Board1(navController = navController)

        }
        composable(route = Screens.Board2.route)
        {
            Board2(navController = navController)
        }
        composable(route = Screens.Board3.route)
        {
            Board3(navController = navController)
        }
        composable(route = Screens.Board4.route)
        {
            Board4(navController = navController)
        }
        composable(route = Screens.Board5.route)
        {
            Board5(navController = navController, viewModel)
        }
        composable(route = Screens.Board6.route)
        {
            Board6(navController = navController)
        }

    }
}