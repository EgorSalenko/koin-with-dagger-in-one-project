package io.esalenko.common.service

import android.util.Log
import javax.inject.Inject


class TrackingService @Inject constructor() {

    companion object {
        private const val TAG = "TrackingService"
    }

    fun trackAwesome() {
        Log.d(TAG, "trackAwesome")
    }

    fun trackHorrible() {
        Log.d(TAG, "trackHorrible")
    }

    fun trackMain() {
        Log.d(TAG, "trackMain")
    }

}