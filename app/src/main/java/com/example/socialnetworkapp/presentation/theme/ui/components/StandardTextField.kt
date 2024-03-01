package com.example.socialnetworkapp.presentation.theme.ui.components

import android.health.connect.datatypes.units.Length
import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.example.socialnetworkapp.R
import com.example.socialnetworkapp.presentation.theme.ui.theme.TextWhite

@Composable
fun StandardTextField(
    modifier: Modifier = Modifier,
    text: String = "",
    hint: String = "",
    maxLength: Int = 40,
    isError: Boolean =false,
    keyboardType:KeyboardType = KeyboardType.Text,
    onValueChange: (String) -> Unit
){


    val isPasswordToggleDisplayed by remember{
        mutableStateOf(keyboardType == KeyboardType.Password)
    }

    var isPasswordVisible by remember {
        mutableStateOf(false)
    }


    TextField(
        value = text,

        onValueChange = {
                        if(it.length <= maxLength){
                            onValueChange(it)
                        }
                        },
        placeholder = {
            Text(text = hint, style = MaterialTheme.typography.bodyLarge)
        },
        isError = isError,
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType
        ),
        singleLine = true,
        visualTransformation = if (!isPasswordVisible && isPasswordToggleDisplayed){
            PasswordVisualTransformation()
        } else {
               VisualTransformation.None
               },
        trailingIcon = {
                       if(isPasswordToggleDisplayed){
                           IconButton(onClick = {
                               isPasswordVisible = !isPasswordVisible
                           }) {
                               Icon(
                                   imageVector = if (isPasswordVisible) {
                                        Icons.Filled.VisibilityOff
                                   }
                                   else{
                                        Icons.Filled.Visibility
                                       },
                                   tint = Color.White,
                                   contentDescription = if(isPasswordVisible){
                                            stringResource(id = R.string.password_visible_content_description)
                                   } else{
                                       stringResource(id = R.string.password_hidden_content_description)
                                   }
                               )

                           }
                       }
        },
        modifier = Modifier
            .fillMaxWidth()
    )
}