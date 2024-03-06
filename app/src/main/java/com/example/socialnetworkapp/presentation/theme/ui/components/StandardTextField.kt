package com.example.socialnetworkapp.presentation.theme.ui.components

import android.health.connect.datatypes.units.Length
import android.text.BoringLayout
import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.semantics.testTagsAsResourceId
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import com.example.socialnetworkapp.R
import com.example.socialnetworkapp.presentation.theme.ui.theme.TextWhite

@Composable
fun StandardTextField(
    modifier : Modifier = Modifier,
    text: String = "",
    hint: String = "",
    maxLength: Int = 40,
    error :String = "",
    keyboardType:KeyboardType = KeyboardType.Text,
    showPasswordToggle: Boolean = false,
    onPasswordToggleClick : (Boolean) -> Unit = {},
    onValueChange: (String) -> Unit
){
    val isPasswordToggleDisplayed by remember{
        mutableStateOf(keyboardType == KeyboardType.Password)
    }


    Column (
        modifier = Modifier
            .fillMaxWidth()
    ){
        TextField(
            value = text,
            onValueChange = {
                if(it.length <= maxLength){
                    onValueChange(it)
                }
            },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = MaterialTheme.colorScheme.surface
            ),
            placeholder = {
                Text(text = hint, style = MaterialTheme.typography.bodyLarge)
            },
            isError = error != "",

            keyboardOptions = KeyboardOptions(
                keyboardType = keyboardType
            ),
            singleLine = true,
            visualTransformation = if (!showPasswordToggle && isPasswordToggleDisplayed){
                PasswordVisualTransformation()
            } else {
                VisualTransformation.None
            },
            trailingIcon = {
                if(isPasswordToggleDisplayed){
                    IconButton(onClick = {
                        onPasswordToggleClick(!showPasswordToggle)
                    }
                    ) {
                        Icon(
                            imageVector = if (showPasswordToggle) {
                                Icons.Filled.VisibilityOff
                            }
                            else{
                                Icons.Filled.Visibility
                            },
                            tint = Color.White,
                            contentDescription = if(showPasswordToggle){
                                stringResource(id = R.string.password_visible_content_description)
                            } else{
                                stringResource(id = R.string.password_hidden_content_description)
                            }
                        )

                    }
                }
            },
            modifier = Modifier.fillMaxWidth()
        )
        if(error.isNotEmpty()){
            Text(
                text = error,
                style = MaterialTheme.typography.bodyMedium,
                color =  MaterialTheme.colorScheme.error,
                textAlign = TextAlign.End,
                modifier = Modifier.fillMaxWidth()
            )

        }


    }

}