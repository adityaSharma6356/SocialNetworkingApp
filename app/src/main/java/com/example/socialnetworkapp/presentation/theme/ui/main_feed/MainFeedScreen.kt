package com.example.socialnetworkapp.presentation.theme.ui.main_feed

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.socialnetworkapp.presentation.theme.ui.activity.ActivityScreen
import com.example.socialnetworkapp.presentation.theme.ui.chat.ChatScreen
import com.example.socialnetworkapp.presentation.theme.ui.components.BottomBar
import com.example.socialnetworkapp.presentation.theme.ui.editprofile.EditProfileScreen
import com.example.socialnetworkapp.presentation.theme.ui.profile.ProfileScreen
import com.example.socialnetworkapp.presentation.theme.ui.util.NavigationBottomBar
import com.example.socialnetworkapp.presentation.theme.ui.util.Screen


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainFeedScreen(
    navController: NavHostController
){
    Scaffold (
        bottomBar = {
        BottomBar(navController = navController, modifier = Modifier)
    },
        ){
        NavigationBottomBar()
    }

    
}

