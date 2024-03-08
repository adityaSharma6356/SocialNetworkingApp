package com.example.socialnetworkapp.presentation.theme.ui.util

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.socialnetworkapp.presentation.theme.ui.chat.ChatScreen
import com.example.socialnetworkapp.presentation.theme.ui.main_feed.MainFeedScreen
import com.example.socialnetworkapp.presentation.theme.ui.profile.ProfileScreen
import com.example.socialnetworkapp.presentation.theme.ui.editprofile.EditProfileScreen
import com.example.socialnetworkapp.presentation.theme.ui.activity.ActivityScreen

@Composable
fun NavigationBottomBar(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ){

        composable(Screen.MainFeedScreen.route) {
            MainFeedScreen(navController = navController)
        }
        composable(Screen.ChatScreen.route) {
            ChatScreen(navController = navController)
        }
        composable(Screen.ProfileScreen.route) {
            ProfileScreen(navController = navController)
        }
        composable(Screen.ActivityScreen.route) {
            ActivityScreen(navController = navController)
        }
        composable(Screen.EditProfileScreen.route){
            EditProfileScreen(navController = navController)
        }

    }
}