package io.esalenko.diinteraction.di.delegate

import io.esalenko.diinteraction.di.ApplicationComponent
import io.esalenko.diinteraction.main.MainViewModel


class AppDelegateViewModel(private val delegate: ApplicationComponent) {

    fun inject(mainViewModel: MainViewModel) = delegate.inject(mainViewModel)

}