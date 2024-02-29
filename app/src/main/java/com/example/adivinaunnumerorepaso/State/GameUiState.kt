package com.example.adivinaunnumerorepaso.State

data class GameUiState (

    val numeroSecreto : Int = ((Math.random() * 10)+1).toInt(),
    val numeroUsuario : Int = 0,
    val numeroIntentos : Int = 1

)