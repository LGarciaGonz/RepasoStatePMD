package com.example.adivinaunnumerorepaso.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.adivinaunnumerorepaso.Screens.FirstScreen
import com.example.adivinaunnumerorepaso.Screens.GameScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route ) {
        composable(route = AppScreens.FirstScreen.route) { FirstScreen(navController) }
        composable(route = AppScreens.GameScreen.route) { GameScreen() }
    }

}