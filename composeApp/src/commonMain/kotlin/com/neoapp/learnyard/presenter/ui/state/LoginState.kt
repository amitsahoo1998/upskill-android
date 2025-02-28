package com.neoapp.learnyard.presenter.ui.state

data class LoginState(
    val isLoading: Boolean = false,
    val mobileNo: String = "",
    val email: String = ""
): State
