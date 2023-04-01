package com.example.tomav.data.models

import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Toma (
    val titulo:String,
    val descrip:String,
    val timestamp:Long,
    val color:Int,
    @PrimaryKey val id:Int?=null
    ) {
    companion object {
        val coloresToma = listOf(Color.Green,Color.Red,Color.Gray,Color.Blue)
    }
}