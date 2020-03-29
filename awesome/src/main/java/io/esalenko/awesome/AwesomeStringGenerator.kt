package io.esalenko.awesome


class AwesomeStringGenerator {

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