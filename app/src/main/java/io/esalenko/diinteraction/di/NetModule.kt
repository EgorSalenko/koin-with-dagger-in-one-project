package io.esalenko.diinteraction.di

import dagger.Module
import dagger.Provides
import io.esalenko.common.service.ApiService
import org.koin.java.KoinJavaComponent
import javax.inject.Singleton

@Module
class NetModule {

    private val apiService = KoinJavaComponent.inject(ApiService::class.java)

    @Singleton
    @Provides
    fun provideApiService(): ApiService {
        return apiService.value
    }
}