package io.esalenko.diinteraction.di

import android.app.Application
import dagger.Module
import dagger.Provides
import io.esalenko.common.service.ApiService
import io.esalenko.common.service.StringGenerator
import io.esalenko.common.service.TrackingService
import io.esalenko.diinteraction.main.MainRepository
import org.koin.java.KoinJavaComponent

@Module(includes = [NetModule::class, TrackingModule::class])
class CommonAppModule {

    val stringGenerator = KoinJavaComponent.inject(StringGenerator::class.java)

    @Provides
    fun provideContext(app: Application) = app.applicationContext

    @Provides
    fun provideStringGenerator(): StringGenerator {
        return StringGenerator().koinInject()
    }

    @Provides
    fun provideMainRepository(
        generator: StringGenerator,
        trackingService: TrackingService,
        apiService: ApiService
    ) =
        MainRepository(generator, trackingService, apiService)

}

inline fun <reified T : Any> T.koinInject(): T = KoinJavaComponent.inject(this::class.java).value
