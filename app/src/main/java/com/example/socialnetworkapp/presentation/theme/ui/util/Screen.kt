package com.example.socialnetworkapp.presentation.theme.ui.util

import com.example.socialnetworkapp.R

sealed class Screen(val route: String, val Icon: Int = 0){



    data object SplashScreen : Screen("splash_screen")
    data object LoginScreen : Screen("login_screen")
    data object RegisterScreen : Screen("register_screen")
    data object MainFeedScreen : Screen("main_feed_screen" , R.drawable.home)
    data object HomeScreen : Screen("home_screen" , R.drawable.home)
    data object PostDetailScreen: Screen("post_detail_screen")
    data object ChatScreen : Screen("chat_screen" ,R.drawable.chat)
    data object MessageScreen : Screen("message_screen")
    data object ProfileScreen : Screen("profile_screen",R.drawable.profile)
    data object EditProfileScreen : Screen("edit_profile_screen",R.drawable.editprofile)
    data object PersonListScreen : Screen("person_list_screen")
    data object CreatePostScreen : Screen("create_post_screen")
    data object ActivityScreen : Screen("activity_screen",R.drawable.activity)
    data object SearchScreen : Screen("search_screen")

}