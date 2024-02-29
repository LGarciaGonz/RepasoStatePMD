package com.example.adivinaunnumerorepaso.Navigation

sealed class AppScreens (val route : String){

    object FirstScreen : AppScreens(route = "first_screen")
    object GameScreen : AppScreens(route = "game_screen")

}