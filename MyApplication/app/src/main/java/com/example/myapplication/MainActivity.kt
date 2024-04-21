package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.apiConnect.RepositoryImpl
import com.example.myapplication.apiConnect.RetrofitInstance
import com.example.myapplication.navigation.Navigation
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    val viewModel by viewModels<ViewModelSmartLab>(factoryProducer = {
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return ViewModelSmartLab(RepositoryImpl(RetrofitInstance.apiSmartLab))
                        as T
            }
        }
    })
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Navigation(viewModel)
            }
        }
    }
}

