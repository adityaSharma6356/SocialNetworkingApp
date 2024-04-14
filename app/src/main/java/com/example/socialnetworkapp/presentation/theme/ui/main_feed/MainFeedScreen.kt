package com.example.socialnetworkapp.presentation.theme.ui.main_feed

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.example.socialnetworkapp.R
import com.example.socialnetworkapp.domain.models.Post
import com.example.socialnetworkapp.presentation.theme.ui.components.Post
import com.example.socialnetworkapp.presentation.theme.ui.components.StandardToolBar
import com.example.socialnetworkapp.presentation.theme.ui.util.Screen


@Composable
fun MainFeedScreen(
    navController: NavController,
) {
    Column (modifier = Modifier.fillMaxWidth()
    ){
        StandardToolBar(
            navController = navController,
                    title = {
                Text(text = stringResource(id = R.string.your_feed),
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
            },
            modifier = Modifier.fillMaxWidth(),
            showBackArrow = true,
            navActions = {
                IconButton(onClick = {
                    navController.navigate(Screen.SearchScreen.route)
                }) {
                    Icon(imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onBackground
                    )
                }
            }
        )
        Post(
            post = Post(
                username = "Gourav",
                imageUrl = "",
                profilePictureUrl = "",
                description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                        " sed do eiusmod tempor incididunt ut labore et dolore magna ." +
                        " Ut enim ad minim veniam, quis nostllamco lab Readmore....",
                likeCount = 17,
                commentCount = 7
            )
        )


    }



}