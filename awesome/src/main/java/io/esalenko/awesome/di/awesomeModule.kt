package io.esalenko.awesome.di

import io.esalenko.awesome.AwesomeRepository
import io.esalenko.awesome.AwesomeStringGenerator
import io.esalenko.awesome.AwesomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val awesomeModule = module {
    factory { AwesomeStringGenerator() }
    factory { AwesomeRepository(get(), get()) }
    viewModel { AwesomeViewModel(get(), get()) }
}