package com.example.socialnetworkapp.presentation.theme.ui.util

import androidx.compose.material.icons.Icons
import com.example.socialnetworkapp.R

sealed class Screen(val route: String, val Icon: Int = 0, val label: String = ""){



    data object SplashScreen : Screen("splash_screen")
    data object LoginScreen : Screen("login_screen")
    data object RegisterScreen : Screen("register_screen")
    data object MainFeedScreen : Screen("main_feed_screen" , R.drawable.home,"Home")
    data object HomeScreen : Screen("home_screen" , R.drawable.home,"Home")
    data object PostDetailScreen: Screen("post_detail_screen")
    data object ChatScreen : Screen("chat_screen" ,R.drawable.chat,"Chat")
    data object MessageScreen : Screen("message_screen")
    data object ProfileScreen : Screen("profile_screen",R.drawable.profile,"Profile")
    data object EditProfileScreen : Screen("edit_profile_screen",R.drawable.editprofile,"Edit")
    data object PersonListScreen : Screen("person_list_screen")
    data object CreatePostScreen : Screen("create_post_screen")
    data object ActivityScreen : Screen("activity_screen",R.drawable.notifications,"Activity")
    data object SearchScreen : Screen("search_screen")

}