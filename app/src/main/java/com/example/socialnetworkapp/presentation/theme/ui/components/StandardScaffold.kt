package com.example.socialnetworkapp.presentation.theme.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun StandardScaffold(content: @Composable () -> Unit){
    Scaffold(
        bottomBar = {
            BottomAppBar (
                modifier = Modifier.fillMaxWidth(),
                containerColor =  MaterialTheme.colorScheme.surface,
                tonalElevation = 5.dp
            ){


            }
        }
    ) {

    }
}