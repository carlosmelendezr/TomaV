package com.example.tomav.data.use_case

import com.example.tomav.data.Repository.TomaRepository
import com.example.tomav.data.models.Toma
import com.example.tomav.data.util.OrderType
import com.example.tomav.data.util.TomaOrden
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class getTomas(
    private val repository: TomaRepository
) {
    operator fun invoke(
        tomaorden: TomaOrden = TomaOrden.fecha(OrderType.Descending))
    :Flow<List<Toma>> {
        return repository.getToma().map { orden ->
            when (tomaorden.orderType) {
                is OrderType.Ascending -> {
                    when (tomaorden) {
                        is TomaOrden.titulo -> orden.sortedBy { it.titulo.lowercase() }
                        is TomaOrden.fecha -> orden.sortedBy { it.timestamp }
                        is TomaOrden.color -> orden.sortedBy { it.color }
                    }

                }
                is OrderType.Descending -> {
                    when (tomaorden) {
                        is TomaOrden.titulo -> orden.sortedByDescending { it.titulo.lowercase() }
                        is TomaOrden.fecha -> orden.sortedByDescending { it.timestamp }
                        is TomaOrden.color -> orden.sortedByDescending { it.color }
                    }

                }

            }

        }

            }
}