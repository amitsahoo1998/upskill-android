package com.neoapp.learnyard.data.repository

import com.neoapp.learnyard.data.datasource.remote.LoginApiService
import com.neoapp.learnyard.data.model.Either
import com.neoapp.learnyard.data.model.RegisterRequest
import com.neoapp.learnyard.data.model.response.LoginResponse
import com.neoapp.learnyard.domain.repository.LoginRepository

class LoginRepositoryImpl (private val loginApiService: LoginApiService) : LoginRepository {
     override suspend fun register(registerRequest: RegisterRequest): Either<LoginResponse> {
        return runCatching {
            val response = loginApiService.register(registerRequest)

            when (response.status) {
                0 -> Either.success(response)
                else -> Either.error(response.message)
            }
        }.getOrElse {
            Either.error("Something went wrong..")
        }
    }
}