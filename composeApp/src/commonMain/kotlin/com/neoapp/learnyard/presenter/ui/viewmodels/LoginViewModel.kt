package com.neoapp.learnyard.presenter.ui.viewmodels

import androidx.lifecycle.viewModelScope
import com.neoapp.learnyard.data.model.RegisterRequest
import com.neoapp.learnyard.domain.repository.LoginRepository
import com.neoapp.learnyard.presenter.ui.state.LoginState
import kotlinx.coroutines.launch


class LoginViewModel (
    private val loginRepository: LoginRepository
) : BaseViewModel<LoginState>(initialState = LoginState()) {

    init {
        register()
    }

    private fun register() {

        viewModelScope.launch {

            val response = loginRepository.register(RegisterRequest("amitsahoo0098@gmail.com","8260601150"))
        }
    }
}