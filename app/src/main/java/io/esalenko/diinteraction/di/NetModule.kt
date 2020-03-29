package io.esalenko.diinteraction.di

import dagger.Module
import dagger.Provides
import io.esalenko.common.service.ApiService
import javax.inject.Singleton

@Module
class NetModule {

    @Singleton
    @Provides
    fun provideApiService(): ApiService {
        return ApiService()
    }
}