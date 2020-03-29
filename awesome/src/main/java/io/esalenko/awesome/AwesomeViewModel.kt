package io.esalenko.awesome

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import io.esalenko.common.ui.BaseViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class AwesomeViewModel(
    app: Application,
    private val awesomeRepository: AwesomeRepository
) : BaseViewModel(app) {

    val awesomeLiveData = MutableLiveData<String>()

    companion object {
        private const val TAG = "AwesomeViewModel"
    }

    fun doSomeAwesome() {
        GlobalScope.launch {
            kotlin.runCatching {
                awesomeRepository.doAwesomeWorkOnBackground()
            }.onSuccess {
                awesomeLiveData.postValue(it)
            }.onFailure {
                Log.e(TAG, it.toString())
            }
        }
    }

}