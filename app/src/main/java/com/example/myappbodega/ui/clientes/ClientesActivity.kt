package com.example.myappbodega.ui.clientes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class ClientesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClientesScreen { finish() }
        }
    }
}

@Composable
fun ClientesScreen(onBack: () -> Unit) {
    val clientesPrueba = listOf(
        "Juan Pérez",
        "Ana López",
        "Carlos Díaz",
        "María Torres",
        "Pedro Gómez"
    )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Clientes", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(24.dp))
            // Lista de clientes de prueba
            clientesPrueba.forEach { cliente ->
                Text(cliente)
                Spacer(modifier = Modifier.height(8.dp))
            }
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = onBack) {
                Text("Regresar")
            }
        }
    }
}