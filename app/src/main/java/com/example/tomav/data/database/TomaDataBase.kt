package com.example.tomav.data.database


import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tomav.data.dao.TomaDao
import com.example.tomav.data.models.Toma

@Database (

    entities=[Toma::class],
    version=1

)
abstract  class TomaDataBase: RoomDatabase() {
    abstract val tomaDao:TomaDao

    companion object {
        const val DATABASE_NAME="tomainv"
    }
}