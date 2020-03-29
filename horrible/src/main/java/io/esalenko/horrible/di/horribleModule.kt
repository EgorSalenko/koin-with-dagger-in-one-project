package io.esalenko.horrible.di

import io.esalenko.horrible.HorribleRepository
import io.esalenko.horrible.HorribleViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val horribleModule = module {
    factory { HorribleRepository(get(), get(), get()) }
    viewModel { HorribleViewModel(androidApplication(), get()) }
}
