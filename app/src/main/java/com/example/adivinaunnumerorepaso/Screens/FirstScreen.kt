package com.example.adivinaunnumerorepaso.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.adivinaunnumerorepaso.Navigation.AppScreens
import androidx.compose.ui.unit.dp

@Composable
fun FirstScreen(navController: NavHostController) {
    Scaffold { paddingValues ->
        FirstScreenBodyContent(
            navController = navController,
            modifier = Modifier.padding(paddingValues)
        )
    }
}

@Composable
fun FirstScreenBodyContent(navController: NavController, modifier: Modifier) {

    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Adivina el número del 1 al 100 en el que estoy pensando. \nTienes 10 intentos.", textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.padding(10.dp))

        Button(onClick = { navController.navigate(AppScreens.GameScreen.route) }) {
            Text(text = "¡A jugar!")
        }
    }

}