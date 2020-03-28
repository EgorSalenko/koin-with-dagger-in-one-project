package io.esalenko.horrible.di

import dagger.Module

@Module(includes = [NetModule::class, TrackingModule::class])
class AppModule {

}