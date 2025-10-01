package com.example.myappbodega.data

val clientesPrueba = listOf("Juan Pérez", "Ana López", "Carlos Díaz", "María Torres")
val fiadosPrueba = listOf("Ana López - $500", "Carlos Díaz - $200")
val proveedoresPrueba = listOf("Distribuidora Central", "Abarrotes del Norte", "Lácteos y Más")
val productosFaltantesPrueba = listOf("Leche", "Pan", "Huevos")

// Token/lista de productos de prueba
data class Producto(
    val nombre: String,
    val descripcion: String,
    val imgRes: String, // Nombre del recurso en drawable (sin extensión)
    val precio: Double,
    val stock: Int
)

// Solo 3 productos, imágenes locales
val productosPrueba = listOf(
    Producto(
        "Leche",
        "Leche entera 1L",
        "leche_1l", // Debe coincidir con el nombre en res/drawable
        25.0,
        10
    ),
    Producto(
        "Arroz",
        "Arroz blanco 1kg",
        "arroz",
        18.5,
        5
    ),
    Producto(
        "Azúcar",
        "Azúcar refinada 1kg",
        "azucar",
        32.0,
        0
    )
)