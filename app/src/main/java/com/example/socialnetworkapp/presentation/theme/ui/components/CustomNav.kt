package com.example.socialnetworkapp.presentation.theme.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.socialnetworkapp.presentation.theme.ui.util.Screen




@Composable
fun BottomBar(
    navController: NavHostController,
    modifier: Modifier,
    mainNavController: NavHostController
){

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
                navController = if(screen==Screen.EditProfileScreen) mainNavController else navController
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

    val lineLength = animateFloatAsState(
        targetValue = if(selected) 1f else 0f,
        animationSpec = tween(
            durationMillis = 300
        )
    )
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .width(width.dp)
            .padding(5.dp)
            .background(Color.Transparent)
            .clickable(
                interactionSource = source,
                indication = null,
                onClick = {

                    if(navController.currentDestination?.route != screen.route){
                        navController.navigate(screen.route)
                    }


                })
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon(
                modifier = Modifier
                    .padding(5.dp)
                    .size(25.dp)
                    .drawBehind {
                        if (lineLength.value > 0f) {
                            drawLine(
                                color = if (selected) contentColor
                                else Color(214, 214, 214, 255),
                                start = Offset(
                                    size.width / 2f - lineLength.value * 10.dp.toPx(),
                                    size.height
                                ),
                                end = Offset(
                                    size.width / 2f + lineLength.value * 10.dp.toPx(),
                                    size.height
                                ),
                                strokeWidth = 2.dp.toPx(),
                                cap = StrokeCap.Round
                            )
                        }
                    },
                painter = painterResource(id = if (selected) screen.Icon else screen.Icon),
                contentDescription = "icon",
                tint = contentColor,
            )

            Text(
                text = screen.label,
                color = contentColor,
                fontSize = 10.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = if(selected) FontWeight.Bold else FontWeight.Normal,
            )

        }
    }

}