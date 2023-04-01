package com.example.tomav.data.util

sealed class OrderType() {
    object Ascending:OrderType()
    object Descending:OrderType()
}
