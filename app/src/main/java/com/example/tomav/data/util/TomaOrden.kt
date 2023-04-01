package com.example.tomav.data.util

sealed class TomaOrden(val orderType: OrderType ){
    class titulo(orderType: OrderType):TomaOrden(orderType)
    class color(orderType: OrderType):TomaOrden(orderType)
    class fecha(orderType: OrderType):TomaOrden(orderType)

}
