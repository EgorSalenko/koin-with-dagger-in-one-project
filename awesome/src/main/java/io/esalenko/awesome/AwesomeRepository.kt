package io.esalenko.awesome

import io.esalenko.common.service.StringGenerator
import io.esalenko.common.service.TrackingService
import kotlinx.coroutines.delay

class AwesomeRepository(
    private val awesomeStringGenerator: StringGenerator,
    private val trackingService: TrackingService
) {

    suspend fun doAwesomeWorkOnBackground(): String {
        delay(1000)
        trackingService.trackAwesome()
        return "It's awesome ${awesomeStringGenerator.getString()}"
    }

}