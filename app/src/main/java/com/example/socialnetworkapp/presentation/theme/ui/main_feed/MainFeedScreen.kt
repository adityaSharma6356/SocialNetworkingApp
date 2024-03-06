package com.example.socialnetworkapp.presentation.theme.ui.main_feed

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.socialnetworkapp.presentation.theme.ui.components.BottomBar



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainFeedScreen(
    navController: NavHostController
){
    Scaffold (bottomBar = {
        BottomBar(navController = navController, modifier = Modifier)
    }){
    }

    
}

