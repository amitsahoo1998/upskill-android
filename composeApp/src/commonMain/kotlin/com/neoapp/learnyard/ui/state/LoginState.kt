package com.neoapp.learnyard.ui.state

data class LoginState(
    val isLoading: Boolean = false,
    val mobileNo: String = "",
    val email: String = ""
): State
