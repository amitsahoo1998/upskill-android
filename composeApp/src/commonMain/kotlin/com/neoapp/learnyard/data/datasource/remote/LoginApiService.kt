package com.neoapp.learnyard.data.datasource.remote

import com.neoapp.learnyard.data.model.BaseResponse
import com.neoapp.learnyard.data.model.RegisterRequest
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType

class LoginApiService (private val httpClient : HttpClient) {

    suspend fun register(registerRequest: RegisterRequest) : BaseResponse{
        return httpClient.post(REGISTER_API) {
            contentType(ContentType.Application.Json)
            setBody(registerRequest)
        }.body()
    }

    companion object{
        private const val BASE_URL = "https://learnyard.mooo.com"
        private const val REGISTER_API = "$BASE_URL/api/auth/register"
    }
}