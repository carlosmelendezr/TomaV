package com.example.tomav.data.use_case

import com.example.tomav.data.Repository.TomaRepository
import com.example.tomav.data.models.InvalidTomaException
import com.example.tomav.data.models.Toma

class insertToma(
    private val repository: TomaRepository) {

    @kotlin.jvm.Throws(InvalidTomaException::class)
    suspend operator fun invoke(toma: Toma) {
        if (toma.descrip.isBlank()) {
            throw InvalidTomaException("La descripcion de la toma no puede estar en blanco")
        }
        repository.insertToma(toma)
    }
}