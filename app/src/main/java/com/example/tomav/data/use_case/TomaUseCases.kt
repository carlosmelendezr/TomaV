package com.example.tomav.data.use_case

import com.example.tomav.data.models.Toma

data class TomaUseCases(
    val getToma: getTomas,
    val deleteToma: deleteToma,
    val insertToma: insertToma
)
