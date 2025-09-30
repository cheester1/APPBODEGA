package com.example.myappbodega.ui.productos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import com.example.myappbodega.data.productosPrueba
import coil.compose.AsyncImage

class ProductosActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProductosScreen { finish() }
        }
    }
}

@Composable
fun ProductosScreen(onBack: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Productos", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(24.dp))
            productosPrueba.forEach { producto ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(bottom = 16.dp)
                ) {
                    AsyncImage(
                        model = producto.img,
                        contentDescription = producto.nombre,
                        modifier = Modifier.size(120.dp),
                        contentScale = ContentScale.Crop,
                    )
                    Text("${producto.nombre} - ${producto.descripcion}")
                    Text("Precio: \$${producto.precio} | Stock: ${producto.stock}")
                }
                Spacer(modifier = Modifier.height(12.dp))
            }
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = onBack) {
                Text("Regresar")
            }
        }
    }
}