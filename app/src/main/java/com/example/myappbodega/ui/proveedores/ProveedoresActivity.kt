package com.example.myappbodega.ui.proveedores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class ProveedoresActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProveedoresScreen { finish() }
        }
    }
}

@Composable
fun ProveedoresScreen(onBack: () -> Unit) {
    val proveedoresPrueba = listOf(
        "Distribuidora Central",
        "Abarrotes del Norte",
        "Lácteos y Más",
        "Bebidas México",
        "Verduras Selectas"
    )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Proveedores", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(24.dp))
            // Lista de proveedores de prueba
            proveedoresPrueba.forEach { proveedor ->
                Text(proveedor)
                Spacer(modifier = Modifier.height(8.dp))
            }
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = onBack) {
                Text("Regresar")
            }
        }
    }
}