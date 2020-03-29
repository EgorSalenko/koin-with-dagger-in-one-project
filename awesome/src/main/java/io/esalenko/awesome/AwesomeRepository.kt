package io.esalenko.awesome

import io.esalenko.common.service.StringGenerator
import io.esalenko.common.service.TrackingService
import kotlinx.coroutines.delay

class AwesomeRepository(
    private val awesomeStringGenerator: StringGenerator,
    val trackingService: TrackingService
//    val apiService: ApiService
) {

    suspend fun doAwesomeWorkOnBackground(): String {
        delay(1000)
        trackingService.trackAwesome()
//        apiService.getOne()
        return "It's awesome ${awesomeStringGenerator.getString()}"
    }

}