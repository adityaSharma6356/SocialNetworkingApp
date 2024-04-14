package com.example.socialnetworkapp.presentation.theme.ui.activity

import android.app.Activity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.example.socialnetworkapp.R
import com.example.socialnetworkapp.presentation.theme.ui.components.StandardToolBar
import com.example.socialnetworkapp.presentation.theme.ui.theme.SpaceMedium
import com.example.socialnetworkapp.presentation.theme.ui.util.Screen

@Composable
fun ActivityScreen(
    navController: NavController
){
    Column(modifier = Modifier
        .fillMaxSize()
    ) {
        StandardToolBar(navController = navController,
            title = {
                Text(text = stringResource(id = R.string.your_activity),
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                    )
            },
            modifier = Modifier.fillMaxWidth(),
            showBackArrow = false
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),
            contentPadding = PaddingValues(SpaceMedium)
        ){
            items(20){

            }
        }

    }
}