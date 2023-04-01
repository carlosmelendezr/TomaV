package com.example.tomav.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tomav.data.models.Toma
import kotlinx.coroutines.flow.Flow


@Dao
interface TomaDao {
     @Query("SELECT * from toma")
     fun getToma(): Flow<List<Toma>>

    @Query("SELECT * from toma WHERE id=:id")
    suspend fun getTomaById(id:Int):Toma?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertToma(toma:Toma)

    @Delete
    suspend fun deleteToma(toma:Toma)



}