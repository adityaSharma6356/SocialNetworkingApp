package com.example.socialnetworkapp.presentation.theme.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.socialnetworkapp.presentation.theme.ui.util.Screen

@Composable
fun BottomBar(navController: NavHostController, modifier: Modifier){
    val screens = listOf(
        Screen.MainFeedScreen,
        Screen.ChatScreen,
        Screen.EditProfileScreen,
        Screen.ActivityScreen,
        Screen.ProfileScreen,
    )
    val navStackBackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navStackBackEntry?.destination
    val source =  remember {
        MutableInteractionSource()
    }
    Row (
        modifier = modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxWidth()
            .padding(top = 3.dp)
            .clickable(source, null) { },
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Top
    ){
        screens.forEach { screen ->
            AddItem(screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }

    }

}

@Composable
fun AddItem(
    screen: Screen,
    currentDestination: NavDestination?,
    navController: NavHostController
){
    val selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true
    val contentColor = if(!selected) Color(214,214,214,255) else MaterialTheme.colorScheme.primary
    val width = LocalConfiguration.current.screenWidthDp/5 - 5
    val source = remember {
        MutableInteractionSource()
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .width(width.dp)
            .background(Color.Transparent)
            .clickable(
                interactionSource = source,
                indication = null,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.findStartDestination().id)
                        launchSingleTop = true
                    }
                })
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon(
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .size(25.dp),
                painter = painterResource(id = if (selected) screen.Icon else screen.Icon),
                contentDescription = "icon",
                tint = contentColor
            )


        }
    }

}