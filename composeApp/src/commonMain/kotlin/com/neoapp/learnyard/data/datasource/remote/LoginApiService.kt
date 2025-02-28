package com.neoapp.learnyard.data.datasource.remote

import com.neoapp.learnyard.data.model.RegisterRequest
import com.neoapp.learnyard.data.model.response.LoginResponse

interface LoginApiService {

    suspend fun register(registerRequest: RegisterRequest) : LoginResponse
}