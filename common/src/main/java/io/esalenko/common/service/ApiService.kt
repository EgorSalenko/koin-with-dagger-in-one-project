package io.esalenko.common.service

import android.util.Log


class ApiService {

    companion object {
        const val TAG = "ApiService"
    }

    fun send() {
        Log.d(TAG, "send")
    }

    fun getOne() {
        Log.d(TAG, "getOne")
    }

    fun fetchAll() {
        Log.d(TAG, "fetchAll")
    }
}