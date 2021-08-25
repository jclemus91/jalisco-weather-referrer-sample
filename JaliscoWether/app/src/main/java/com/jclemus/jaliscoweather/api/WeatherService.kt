package com.jclemus.jaliscoweather.api

import com.jclemus.jaliscoweather.model.WeatherResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherService {
    @GET("data/2.5/weather")
    fun listRepos(
        @Query("q") place: String,
        @Query("units") metric: String,
        @Query("appid") appid: String
    ): Call<List<WeatherResult>>
}

