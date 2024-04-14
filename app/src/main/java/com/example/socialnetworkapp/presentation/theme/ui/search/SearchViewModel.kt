package com.example.socialnetworkapp.presentation.theme.ui.search

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.socialnetworkapp.presentation.theme.ui.components.StandardTextField
import com.example.socialnetworkapp.presentation.theme.ui.util.states.StandardTextFieldState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import androidx.compose.runtime.State


@HiltViewModel
class SearchViewModel @Inject constructor(

): ViewModel(){
    private val  _searchState = mutableStateOf(StandardTextFieldState())
    val searchState: State<StandardTextFieldState> = _searchState

    fun setSearchState(state: StandardTextFieldState){
        _searchState.value = state
    }
}