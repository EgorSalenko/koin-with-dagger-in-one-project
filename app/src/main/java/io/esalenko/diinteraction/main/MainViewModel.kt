package io.esalenko.diinteraction.main

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import io.esalenko.common.ui.BaseViewModel
import io.esalenko.diinteraction.AwesomeApplication
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject


class MainViewModel(app: Application) : BaseViewModel(app) {

    val mainLiveData = MutableLiveData<String>()

    @Inject
    lateinit var repository: MainRepository

    companion object {
        private const val TAG = "MainViewModel"
    }

    init {
        getApplication<AwesomeApplication>().viewModelDelegate.inject(this)
    }

    fun doSome() {
        GlobalScope.launch {
            kotlin.runCatching {
                repository.doSomethinOnBackThread()
            }.onSuccess {
                mainLiveData.postValue(it)
            }.onFailure {
                Log.e(TAG, it.toString())
            }
        }
    }
}