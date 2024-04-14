package com.example.socialnetworkapp.presentation.theme.ui.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.socialnetworkapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StandardToolBar(
    navController: NavController,
    modifier: Modifier = Modifier,

    showBackArrow: Boolean = false,
    navActions: @Composable RowScope.() -> Unit = {},
    title: @Composable () -> Unit = {}
){
    TopAppBar(
        title = title,
        modifier = modifier,
        navigationIcon = {
                         if(showBackArrow){
                             IconButton(onClick = {
                                 navController.navigateUp()
                             }) {
                                 Icon(imageVector = Icons.Default.ArrowBackIosNew,
                                     contentDescription = stringResource(id = R.string.back),
                                     tint = MaterialTheme.colorScheme.onBackground
                                 )
                             }
                         }

        },
        actions = navActions,
    )
}

