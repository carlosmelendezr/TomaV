package com.example.tomav

import android.app.Application
import androidx.room.Room
import com.example.tomav.data.Repository.TomaRepoImp
import com.example.tomav.data.Repository.TomaRepository
import com.example.tomav.data.database.TomaDataBase
import com.example.tomav.data.use_case.TomaUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTomaDatabase(app:Application):TomaDataBase {
        return Room.databaseBuilder(
            app,
            TomaDataBase::class.java,
            TomaDataBase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideTomaRepository(db:TomaDataBase):TomaRepository {
        return TomaRepoImp(db.tomaDao)
    }


    @Provides
    @Singleton
    fun provideTomaUsecases(repository: TomaRepository):TomaUseCases {
        
    }
}