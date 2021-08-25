package com.jclemus.jaliscoweather.model

data class Weather(
    val temp: Double
)

data class WeatherResult(
    val weathers: List<Weather>,
    val name: String
)
