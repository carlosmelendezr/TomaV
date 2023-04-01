package com.example.tomav.data.Repository

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tomav.data.models.Toma
import kotlinx.coroutines.flow.Flow

interface TomaRepository {
    fun getToma(): Flow<List<Toma>>
    suspend fun getTomaById(id:Int): Toma?
    suspend fun insertToma(toma: Toma)
    suspend fun deleteToma(toma: Toma)

}