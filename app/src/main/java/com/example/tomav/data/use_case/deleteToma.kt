package com.example.tomav.data.use_case

import com.example.tomav.data.Repository.TomaRepository
import com.example.tomav.data.models.Toma

class deleteToma(
    private val tomarepository : TomaRepository
) {

    suspend operator fun invoke(toma : Toma) {
        tomarepository.deleteToma(toma)
    }
}