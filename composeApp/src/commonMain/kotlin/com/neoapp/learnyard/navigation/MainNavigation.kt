package com.neoapp.learnyard.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.neoapp.learnyard.presenter.screens.LoginScreen
import com.neoapp.learnyard.presenter.screens.SplashScreen
import com.neoapp.learnyard.presenter.ui.Screen

const val APP_NAV_HOST_ROUTE = "app-main-route"

@Composable
fun MainNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = Screen.Splash.route){

        composable(Screen.Splash.route){
            SplashScreen(){
                navController.popAllAndNavigateToLogin()
            }
        }

        composable(Screen.Login.route) {
            LoginScreen()
        }


    }

}

/**
 * Clears backstack including current screen and navigates to Login Screen
 */
fun NavController.popAllAndNavigateToLogin() = navigate(Screen.Login.route){
    popUpTo(APP_NAV_HOST_ROUTE)
    launchSingleTop = true
}