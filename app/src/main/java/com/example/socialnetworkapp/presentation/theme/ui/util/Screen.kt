package com.example.socialnetworkapp.presentation.theme.ui.util

import com.example.socialnetworkapp.R

sealed class Screen(val route: String, val Icon: Int = 0){



    object SplashScreen : Screen("splash_screen")
    object LoginScreen : Screen("login_screen")
    object RegisterScreen : Screen("register_screen")
    object MainFeedScreen : Screen("main_feed_screen" , R.drawable.home)
    object PostDetailScreen: Screen("post_detail_screen")
    object ChatScreen : Screen("chat_screen" ,R.drawable.chat)
    object MessageScreen : Screen("message_screen")
    object ProfileScreen : Screen("profile_screen",R.drawable.profile)
    object EditProfileScreen : Screen("edit_profile_screen",R.drawable.editprofile)
    object PersonListScreen : Screen("person_list_screen")
    object CreatePostScreen : Screen("create_post_screen")
    object ActivityScreen : Screen("activity_screen",R.drawable.activity)
    object SearchScreen : Screen("search_screen")

}