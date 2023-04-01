package com.example.tomav.data.dao

import androidx.room.*
import com.example.tomav.data.models.Toma
import kotlinx.coroutines.flow.Flow


@Dao
interface TomaDao {
     @Query("SELECT * from toma")
     fun getToma(): Flow<List<Toma>>

    @Query("SELECT * from toma WHERE id = :id")
    fun getTomaById(id:Int):Toma?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertToma(toma:Toma)

    @Delete
    fun deleteToma(toma:Toma)



}