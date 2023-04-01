package com.example.tomav.data.use_case

import com.example.tomav.data.Repository.TomaRepository
import com.example.tomav.data.models.Toma

class insertToma(
    private val repository: TomaRepository) {

    suspend operator fun invoke(toma: Toma) {
        repository.insertToma(toma)
    }
}