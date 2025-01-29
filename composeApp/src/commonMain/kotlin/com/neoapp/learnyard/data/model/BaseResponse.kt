package com.neoapp.learnyard.data.model

@kotlinx.serialization.Serializable
data class BaseResponse(
    val message: String,
    val status: Int
)