package io.esalenko.common.service

import javax.inject.Inject


class StringGenerator @Inject constructor() {

    private val randomArray = arrayOf(
        "element",
        "cheese",
        "hurl",
        "nest",
        "customer",
        "story",
        "place",
        "pain",
        "forget",
        "high",
        "entertainment",
        "parking",
        "doubt",
        "pepper",
        "popular",
        "heaven",
        "grass",
        "cassette",
        "visit",
        "census"
    )

    fun getString() = randomArray.random()

}