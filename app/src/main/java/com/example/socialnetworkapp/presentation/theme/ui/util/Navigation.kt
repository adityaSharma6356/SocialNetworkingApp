package com.example.socialnetworkapp.presentation.theme.ui.util

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.socialnetworkapp.presentation.theme.ui.home.HomeNavHost
import com.example.socialnetworkapp.presentation.theme.ui.login.LoginScreen
import com.example.socialnetworkapp.presentation.theme.ui.register.RegisterScreen
import com.example.socialnetworkapp.presentation.theme.ui.splash.SplashScreen

@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ){
        composable(Screen.SplashScreen.route){
            SplashScreen(navController = navController)
        }
        
        composable(Screen.LoginScreen.route){
            LoginScreen(navController = navController)
        }
        
        composable(Screen.RegisterScreen.route){
            RegisterScreen(navController = navController)
        }

        composable(Screen.HomeScreen.route){
            HomeNavHost(navController = navController)
        }

    }

}