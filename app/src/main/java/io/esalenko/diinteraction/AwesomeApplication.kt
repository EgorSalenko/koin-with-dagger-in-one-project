package io.esalenko.diinteraction

import android.app.Application
import io.esalenko.diinteraction.di.DaggerApplicationComponent
import io.esalenko.diinteraction.di.appComponent
import io.esalenko.diinteraction.di.delegate.AppDelegateActivity
import io.esalenko.diinteraction.di.delegate.AppDelegateViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.Koin
import org.koin.core.context.startKoin
import javax.inject.Inject

class AwesomeApplication : Application() {

    private val applicationComponent = DaggerApplicationComponent.builder()
        .application(this)
        .build()

    lateinit var viewModelDelegate: AppDelegateViewModel
    lateinit var activityDelegate: AppDelegateActivity

    @Inject
    lateinit var koin: Koin

    override fun onCreate() {
        super.onCreate()
        viewModelDelegate = AppDelegateViewModel(applicationComponent)
        activityDelegate = AppDelegateActivity(applicationComponent)
        startKoin {
            androidContext(this@AwesomeApplication)
            androidLogger()
            modules(appComponent)
        }
    }
}