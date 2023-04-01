package com.example.tomav.data.models

import com.example.tomav.data.util.TomaOrden

sealed class TomaEvents {
    data class Order(val tomaOrden: TomaOrden):TomaEvents()
    data class deleteToma( val toma:Toma):TomaEvents()
    data class insertToma( val toma:Toma):TomaEvents()
    object restoreToma:TomaEvents()
    object toggleOrderSelection:TomaEvents()

}