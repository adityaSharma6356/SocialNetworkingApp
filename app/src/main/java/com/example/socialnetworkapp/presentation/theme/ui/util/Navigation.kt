package com.example.socialnetworkapp.presentation.theme.ui.util

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.socialnetworkapp.presentation.theme.ui.components.StandardScaffold
import com.example.socialnetworkapp.presentation.theme.ui.editprofile.EditProfileScreen
import com.example.socialnetworkapp.presentation.theme.ui.login.LoginScreen
import com.example.socialnetworkapp.presentation.theme.ui.main_feed.MainFeedScreen
import com.example.socialnetworkapp.presentation.theme.ui.register.RegisterScreen
import com.example.socialnetworkapp.presentation.theme.ui.search.SearchScreen
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
            StandardScaffold(navController = navController)
        }

        composable(Screen.EditProfileScreen.route){
            EditProfileScreen(navController = navController)
        }
        composable(Screen.SearchScreen.route){
            SearchScreen(navController = navController)
        }


    }

}