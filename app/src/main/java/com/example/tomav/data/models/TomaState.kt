package com.example.tomav.data.models

import com.example.tomav.data.util.OrderType
import com.example.tomav.data.util.TomaOrden

data class TomaState(
    val tomas:List<Toma> = emptyList(),
    val tomaOrden:TomaOrden = TomaOrden.fecha(OrderType.Descending),
    val isOrderSelecionVisible : Boolean = false
)
