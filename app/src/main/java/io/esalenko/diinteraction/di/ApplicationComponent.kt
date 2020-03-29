package io.esalenko.diinteraction.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import io.esalenko.diinteraction.main.MainActivity
import io.esalenko.diinteraction.main.MainViewModel
import javax.inject.Singleton

@Singleton
@Component(modules = [CommonAppModule::class])
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): ApplicationComponent
    }

    fun inject(mainVM: MainViewModel)
    fun inject(mainActivity: MainActivity)
}
