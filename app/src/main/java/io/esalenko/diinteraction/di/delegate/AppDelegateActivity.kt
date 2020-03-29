package io.esalenko.diinteraction.di.delegate

import io.esalenko.diinteraction.di.ApplicationComponent
import io.esalenko.diinteraction.main.MainActivity


class AppDelegateActivity(private val delegate: ApplicationComponent) {
    fun inject(mainActivity: MainActivity) = delegate.inject(mainActivity)
}