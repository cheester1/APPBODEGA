package com.example.myappbodega.data.model

data class Producto(
    val id: Int,
    val nombre: String,
    val precio: Double,
    val stock: Int,
    val proveedorId: Int?
)