package io.esalenko.diinteraction.di

import android.app.Application
import dagger.Module
import dagger.Provides
import io.esalenko.common.service.ApiService
import io.esalenko.common.service.StringGenerator
import io.esalenko.common.service.TrackingService
import io.esalenko.diinteraction.main.MainRepository
import org.koin.core.Koin
import org.koin.core.context.KoinContextHandler

@Module(includes = [NetModule::class, TrackingModule::class])
class CommonAppModule {

    @Provides
    fun provideContext(app: Application) = app.applicationContext

    @Provides
    fun provideStringGenerator(): StringGenerator {
        return StringGenerator()
    }

    @Provides
    fun provideMainRepository() =
        MainRepository(/*generator, trackingService*/)

    @Provides
    fun providesKoin(
        generator: StringGenerator,
        trackingService: TrackingService,
        apiService: ApiService
    ): Koin {
        return KoinContextHandler.get().apply {
            declare(generator)
            declare(trackingService)
            declare(apiService)
        }
    }
}


inline fun <reified T : Any> T.declareWithKoin(): T {
    return lazy(LazyThreadSafetyMode.NONE) {
        KoinContextHandler.get().declare(this)
        this
    }.value
}