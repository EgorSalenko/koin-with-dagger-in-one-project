package io.esalenko.diinteraction.di

import dagger.Module
import dagger.Provides
import io.esalenko.common.service.TrackingService
import javax.inject.Singleton

@Module
class TrackingModule {

    @Singleton
    @Provides
    fun provideTrackingService(): TrackingService {
        return TrackingService()
    }
}