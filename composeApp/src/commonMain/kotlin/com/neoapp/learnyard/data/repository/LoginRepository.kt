package com.neoapp.learnyard.data.repository

import com.neoapp.learnyard.data.model.Either
import com.neoapp.learnyard.data.model.RegisterRequest
import com.neoapp.learnyard.data.model.response.BaseResponse
import com.neoapp.learnyard.data.model.response.LoginResponse

interface LoginRepository {

    suspend fun register(registerRequest: RegisterRequest): Either<LoginResponse>

}