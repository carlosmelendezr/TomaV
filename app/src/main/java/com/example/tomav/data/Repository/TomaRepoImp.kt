package com.example.tomav.data.Repository

import com.example.tomav.data.dao.TomaDao
import com.example.tomav.data.models.Toma
import kotlinx.coroutines.flow.Flow

class TomaRepoImp(
    private val daoObj: TomaDao
):TomaRepository

 {
     override fun getToma(): Flow<List<Toma>> {
         return daoObj.getToma()
     }

     override suspend fun getTomaById(id: Int): Toma? {
         return daoObj.getTomaById(id)
     }

     override suspend fun insertToma(toma: Toma) {
         daoObj.insertToma(toma)
     }

     override suspend fun deleteToma(toma: Toma) {
        daoObj.deleteToma(toma)
     }
 }