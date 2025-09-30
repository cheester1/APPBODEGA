package com.example.myappbodega.ui.fiados

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class FiadosActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FiadosScreen { finish() }
        }
    }
}

@Composable
fun FiadosScreen(onBack: () -> Unit) {
    val fiadosPrueba = listOf(
        "Ana López - $500",
        "Carlos Díaz - $200",
        "María Torres - $150",
        "Juan Pérez - $75"
    )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Fiados", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(24.dp))
            // Lista de fiados de prueba
            fiadosPrueba.forEach { fiado ->
                Text(fiado)
                Spacer(modifier = Modifier.height(8.dp))
            }
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = onBack) {
                Text("Regresar")
            }
        }
    }
}