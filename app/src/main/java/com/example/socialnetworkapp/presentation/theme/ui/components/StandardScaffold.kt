package com.example.socialnetworkapp.presentation.theme.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.socialnetworkapp.presentation.theme.ui.util.NavigationBottomBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun StandardScaffold(navController: NavHostController){
    val navControllerTwo = rememberNavController()
    val navControllerThree = rememberNavController()

    Scaffold (

        bottomBar = {
            BottomBar(navController = navControllerTwo, modifier = Modifier, mainNavController = navController)
        },
    ){
        NavigationBottomBar(navControllerTwo)
    }
}