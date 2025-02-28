package com.neoapp.learnyard.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.neoapp.learnyard.presenter.ui.Screen

const val APP_NAV_HOST_ROUTE = "app-main-route"

@Composable
fun MainNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = Screen.Login.route){

        composable()

    }

}