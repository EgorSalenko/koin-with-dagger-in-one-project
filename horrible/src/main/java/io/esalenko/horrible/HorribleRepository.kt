package io.esalenko.horrible

import io.esalenko.common.service.ApiService
import io.esalenko.common.service.StringGenerator
import io.esalenko.common.service.TrackingService
import kotlinx.coroutines.delay

class HorribleRepository(
    private val stringGenerator: StringGenerator,
    private var trackingService: TrackingService,
    private var apiService: ApiService
) {

    suspend fun doSomeHorrible(): String {
        delay(1000)
        trackingService.trackHorrible()
        apiService.fetchAll()
        return "It's horrible ${stringGenerator.getString()}"
    }
}