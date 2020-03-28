package io.esalenko.diinteraction

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import io.esalenko.diinteraction.di.AppInjector
import io.esalenko.diinteraction.di.appComponent
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import javax.inject.Inject

class AwesomeApplication : DaggerApplication() {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<out DaggerApplication>

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AwesomeApplication)
            appComponent
        }
        AppInjector.inject(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return dispatchingAndroidInjector
    }
}