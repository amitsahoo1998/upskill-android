package com.neoapp.learnyard.data.model.response

@kotlinx.serialization.Serializable
data class LoginResponse(
    override val message: String,
    override val status: Int
):BaseResponse
