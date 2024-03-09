package com.example.socialnetworkapp.presentation.theme.ui.home

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.socialnetworkapp.presentation.theme.ui.components.BottomBar
import com.example.socialnetworkapp.presentation.theme.ui.util.NavigationBottomBar


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeNavHost(
    navController: NavHostController
){

    val navControllerTwo = rememberNavController()
    Scaffold (
        bottomBar = {
        BottomBar(navController = navControllerTwo, modifier = Modifier, mainNavController = navController)
    },
        ){
        NavigationBottomBar(navControllerTwo)
    }

    
}

