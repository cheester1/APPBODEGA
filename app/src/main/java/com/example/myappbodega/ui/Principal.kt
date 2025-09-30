package com.example.myappbodega.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.myappbodega.ui.clientes.ClientesActivity
import com.example.myappbodega.ui.fiados.FiadosActivity
import com.example.myappbodega.ui.productos.ProductosActivity
import com.example.myappbodega.ui.proveedores.ProveedoresActivity
import com.example.myappbodega.ui.productosfaltantes.ProductosFaltantesActivity
import com.example.myappbodega.ui.theme.MyAppBodegaTheme

class Principal : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyAppBodegaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PrincipalScreen()
                }
            }
        }
    }
}

@Composable
fun PrincipalScreen() {
    val context = LocalContext.current
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(24.dp)
        ) {
            Text(
                text = "Bienvenido a la pantalla principal",
                style = MaterialTheme.typography.headlineMedium
            )
            Spacer(modifier = Modifier.height(32.dp))
            Button(
                onClick = {
                    context.startActivity(Intent(context, ProductosActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            ) {
                Text("Productos")
            }
            Button(
                onClick = {
                    context.startActivity(Intent(context, ClientesActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            ) {
                Text("Clientes")
            }
            Button(
                onClick = {
                    context.startActivity(Intent(context, FiadosActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            ) {
                Text("Fiados")
            }
            Button(
                onClick = {
                    context.startActivity(Intent(context, ProductosFaltantesActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            ) {
                Text("Productos Faltantes")
            }
            Button(
                onClick = {
                    context.startActivity(Intent(context, ProveedoresActivity::class.java))
                },
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            ) {
                Text("Proveedores")
            }
        }
    }
}