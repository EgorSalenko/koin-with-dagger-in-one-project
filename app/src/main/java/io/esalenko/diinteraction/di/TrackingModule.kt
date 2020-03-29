package io.esalenko.diinteraction.di

import dagger.Module
import dagger.Provides
import io.esalenko.common.service.TrackingService
import org.koin.java.KoinJavaComponent
import javax.inject.Singleton

@Module
class TrackingModule {

    private val trackingService = KoinJavaComponent.inject(TrackingService::class.java)

    @Singleton
    @Provides
    fun provideTrackingService(): TrackingService {
        return trackingService.value
    }
}