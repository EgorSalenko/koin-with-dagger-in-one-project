package io.esalenko.horrible

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import io.esalenko.common.ui.BaseViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class HorribleViewModel constructor(app: Application, private val repository: HorribleRepository) :
    BaseViewModel(app) {

    companion object {
        private const val TAG = "HorribleViewModel"
    }

    val horribleLiveData = MutableLiveData<String>()

    fun doSomeHorrible() {
        GlobalScope.launch {
            kotlin.runCatching {
                repository.doSomeHorrible()
            }.onSuccess {
                horribleLiveData.postValue(it)
            }.onFailure {
                Log.d(TAG, it.toString())
            }
        }
    }

}