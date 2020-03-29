package io.esalenko.diinteraction.main

import kotlinx.coroutines.delay
import javax.inject.Inject


class MainRepository @Inject constructor(
//    private val stringGenerator: StringGenerator,
//    val trackingService: TrackingService
//    val apiService: ApiService
) {

    suspend fun doSomethinOnBackThread(): String {
        delay(3000)
//        trackingService.trackMain()
        return "stringGenerator.getString()"
    }
}
