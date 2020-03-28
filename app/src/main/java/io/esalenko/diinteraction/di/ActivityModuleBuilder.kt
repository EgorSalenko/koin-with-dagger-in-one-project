package io.esalenko.diinteraction.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.esalenko.diinteraction.MainActivity

@Module
interface ActivityModuleBuilder {

    @ContributesAndroidInjector
    fun bindMainActivity() : MainActivity

}