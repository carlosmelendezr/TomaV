package com.example.tomav.data.use_case

import com.example.tomav.data.Repository.TomaRepository
import com.example.tomav.data.models.Toma
import com.example.tomav.data.util.TomaOrden
import kotlinx.coroutines.flow.Flow

class getTomas(
    private val repository: TomaRepository
) {
    operator fun invoke(tomaorden: TomaOrden):Flow<List<Toma>>{
            }
}