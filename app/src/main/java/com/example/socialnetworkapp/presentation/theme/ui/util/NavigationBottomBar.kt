package com.example.socialnetworkapp.presentation.theme.ui.util

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.socialnetworkapp.presentation.theme.ui.chat.ChatScreen
import com.example.socialnetworkapp.presentation.theme.ui.profile.ProfileScreen
import com.example.socialnetworkapp.presentation.theme.ui.editprofile.EditProfileScreen
import com.example.socialnetworkapp.presentation.theme.ui.activity.ActivityScreen
import com.example.socialnetworkapp.presentation.theme.ui.main_feed.MainFeedScreen

@Composable
fun NavigationBottomBar(navControllerTwo: NavHostController) {

    NavHost(
        navController = navControllerTwo,
        startDestination = Screen.MainFeedScreen.route
    ){

        composable(Screen.MainFeedScreen.route) {
            MainFeedScreen(navController = navControllerTwo)
        }
        composable(Screen.ChatScreen.route) {
            ChatScreen(navController = navControllerTwo)
        }
        composable(Screen.ProfileScreen.route) {
            ProfileScreen(navController = navControllerTwo)
        }
        composable(Screen.ActivityScreen.route) {
            ActivityScreen(navController = navControllerTwo)
        }
        composable(Screen.EditProfileScreen.route){
            EditProfileScreen(navController = navControllerTwo)
        }

    }
}