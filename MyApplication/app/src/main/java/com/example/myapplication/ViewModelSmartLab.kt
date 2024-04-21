package com.example.myapplication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.apiConnect.Repository
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class ViewModelSmartLab(private val repository:Repository): ViewModel() {
    private val _showErrorToastChannel = Channel<Boolean>()
    val showErrorToastChannel = _showErrorToastChannel.receiveAsFlow()

    fun sendCodeEmail(email: String) {
        viewModelScope.launch {
            repository.sendCodeEmail(email).collectLatest { result ->
                when (result) {
                    is com.example.myapplication.apiConnect.Result.Success -> {
                        _showErrorToastChannel.send(false)
                    }

                    is com.example.myapplication.apiConnect.Result.Error -> {
                        _showErrorToastChannel.send(true)
                    }

                }
            }
        }
    }
}