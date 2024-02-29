package com.example.adivinaunnumerorepaso.State

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class GameViewModel: ViewModel() {

    private val _gameUiState = MutableStateFlow(GameUiState())
    val gameUiState : StateFlow<GameUiState> = _gameUiState.asStateFlow()

    fun onNumeroUsuarioChange ( numero : String ) {

        _gameUiState.update {
            currentState -> currentState.copy(numeroUsuario = numero.toInt())
        }
    }

    fun comprobar() : String {

        if (gameUiState.value.numeroSecreto == gameUiState.value.numeroUsuario) {
            return "Has acertado"
        } else if (gameUiState.value.numeroSecreto < gameUiState.value.numeroUsuario) {
            return "El número secreto es menor"
        } else {
            return "El número secreto es mayor"
        }
    }
}