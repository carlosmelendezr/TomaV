package com.example.tomav.data.database


import androidx.room.Database
import com.example.tomav.data.dao.TomaDao
import com.example.tomav.data.models.Toma

@Database (

    entities=[Toma::class],
    version=1

)
abstract  class TomaDataBase {
    abstract val tomaDao:TomaDao
}