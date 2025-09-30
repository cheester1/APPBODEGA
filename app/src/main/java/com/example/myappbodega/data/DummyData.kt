package com.example.myappbodega.data

val clientesPrueba = listOf("Juan Pérez", "Ana López", "Carlos Díaz", "María Torres")
val fiadosPrueba = listOf("Ana López - $500", "Carlos Díaz - $200")
val proveedoresPrueba = listOf("Distribuidora Central", "Abarrotes del Norte", "Lácteos y Más")
val productosFaltantesPrueba = listOf("Leche", "Pan", "Huevos")

// Token/lista de productos de prueba
data class Producto(
    val nombre: String,
    val descripcion: String,
    val img: String,
    val precio: Double,
    val stock: Int
)

val productosPrueba = listOf(
    Producto(
        "Leche",
        "Leche entera 1L",
        "https://cdn1.totalcommerce.cloud/mercacentro/product-zoom/es/leche-entera-caja-1-l-1.webp",
        25.0,
        10
    ),
    Producto(
        "Pan",
        "Bolsa de pan blanco",
        "https://cdn7.kiwilimon.com/recetaimagen/26386/640x640/32898.jpg.webp",
        18.5,
        5
    ),
    Producto(
        "Huevos",
        "Docena de huevos blancos",
        "https://www.huevosguillen.com/wp-content/uploads/2019/11/huevos-blancos.jpg",
        32.0,
        0
    ),
    Producto(
        "Refresco",
        "Refresco cola 2L",
        "https://jumboargentina.vtexassets.com/arquivos/ids/621155-800-auto?v=638302066591800000&width=800&height=auto&aspect=true",
        28.0,
        3
    ),
    Producto(
        "Galletas",
        "Galletas de chocolate",
        "https://www.galletasgamito.com/wp-content/uploads/2020/03/galletas-chocolate.jpg",
        22.5,
        12
    )
)