package io.esalenko.horrible.di

import io.esalenko.common.service.ApiService
import io.esalenko.common.service.StringGenerator
import io.esalenko.common.service.TrackingService
import io.esalenko.horrible.HorribleRepository
import io.esalenko.horrible.HorribleViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val horribleModule = module {
    factory { TrackingService() }
    factory { StringGenerator() }
    factory { ApiService() }
    factory { HorribleRepository(get(), get(), get()) }
    viewModel { HorribleViewModel(androidApplication(), get()) }
}
