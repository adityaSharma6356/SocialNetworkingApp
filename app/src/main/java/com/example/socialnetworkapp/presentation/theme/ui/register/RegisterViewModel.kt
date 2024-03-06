package com.example.socialnetworkapp.presentation.theme.ui.register

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class RegisterViewModel @Inject constructor():ViewModel() {

    private val _usernameText = mutableStateOf("")
    val usernameText: State<String> = _usernameText

    private val _emailText = mutableStateOf("")
    val emailText: State<String> = _emailText

    private val _passwordText = mutableStateOf("")
    val passwordText: State<String> = _passwordText

    private val _showPassword = mutableStateOf(false)
    val showPassword: State<Boolean> = _showPassword

    private val _UsernameError  = mutableStateOf("")
    val isUsernameError: State<String> = _UsernameError

    private val _emailError  = mutableStateOf("")
    val emailError: State<String> = _emailError


    private val _PasswordError  = mutableStateOf("")
    val isPasswordError: State<String> = _PasswordError

    fun setUsernameText(username: String){
        _usernameText.value = username
    }
    fun setEmailText(email: String){
        _emailText.value = email
    }
    fun setPasswordText(password:String){
        _passwordText.value = password
    }
    fun setIsUsernameError(error: String){
        _UsernameError.value = error
    }

    fun setIsEmailError(error: String){
        _UsernameError.value = error
    }
    fun setIsPasswordError(error: String){
        _PasswordError.value = error
    }
    fun setShowPassword(showPassword : Boolean){
        _showPassword.value = showPassword
    }


}