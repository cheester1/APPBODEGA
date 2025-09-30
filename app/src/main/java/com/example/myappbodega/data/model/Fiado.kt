package com.example.myappbodega.data.model

data class Fiado(
    val id: Int,
    val clienteId: Int,
    val productoId: Int,
    val cantidad: Int,
    val total: Double,
    val fecha: String
)