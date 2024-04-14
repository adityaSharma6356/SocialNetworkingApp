package com.example.socialnetworkapp.presentation.theme.ui.util

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.socialnetworkapp.presentation.theme.ui.activity.ActivityScreen
import com.example.socialnetworkapp.presentation.theme.ui.chat.ChatScreen
import com.example.socialnetworkapp.presentation.theme.ui.editprofile.EditProfileScreen
import com.example.socialnetworkapp.presentation.theme.ui.main_feed.MainFeedScreen
import com.example.socialnetworkapp.presentation.theme.ui.profile.ProfileScreen

@Composable
fun NavigationTopBar(navControllerThree: NavHostController) {

    NavHost(
        navController = navControllerThree,
        startDestination = Screen.MainFeedScreen.route
    ){

        composable(Screen.MainFeedScreen.route) {
            MainFeedScreen(navController = navControllerThree)
        }
        composable(Screen.ChatScreen.route) {
            ChatScreen(navController = navControllerThree)
        }
        composable(Screen.ProfileScreen.route) {
            ProfileScreen(navController = navControllerThree)
        }
        composable(Screen.ActivityScreen.route) {
            ActivityScreen(navController = navControllerThree)
        }


    }
}