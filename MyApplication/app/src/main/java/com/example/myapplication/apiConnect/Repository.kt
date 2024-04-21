package com.example.myapplication.apiConnect

import kotlinx.coroutines.flow.Flow

interface Repository {

    suspend fun sendCodeEmail(email:String): Flow<Result<String>>
}