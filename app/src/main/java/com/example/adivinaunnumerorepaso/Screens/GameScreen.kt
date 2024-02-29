package com.example.adivinaunnumerorepaso.Screens

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.adivinaunnumerorepaso.State.GameViewModel

@Composable
fun GameScreen() {

    val gameViewModel: GameViewModel = viewModel()

    Scaffold { paddingValues ->
        GameScreenBodyContent(gameViewModel, modifier = Modifier.padding(paddingValues))
    }
}


@Composable
fun GameScreenBodyContent(gameViewModel: GameViewModel, modifier: Modifier) {

    val gameUiState by gameViewModel.gameUiState.collectAsState()
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        OutlinedTextField(
            value = gameUiState.numeroUsuario.toString(),
            onValueChange = { gameViewModel.onNumeroUsuarioChange(it) },
            label = { Text(text = "Introduce un número") }
        )

        Spacer(modifier = Modifier.padding(10.dp))

        Button(onClick = {
            Toast.makeText(context, gameViewModel.comprobar(), Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Comprobar")
        }
    }
}

fun comprobar() {
    TODO("Not yet implemented")
}