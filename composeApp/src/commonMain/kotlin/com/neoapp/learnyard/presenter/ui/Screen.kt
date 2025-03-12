package com.neoapp.learnyard.presenter.ui

sealed class Screen (val route: String, val name: String) {

    data object Splash : Screen("splash", "SplashScreen")

    data object Login : Screen("login", "LoginScreen")
}