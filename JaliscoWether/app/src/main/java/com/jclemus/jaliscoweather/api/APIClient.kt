package com.jclemus.jaliscoweather.api

import retrofit2.Retrofit


val retrofit = Retrofit.Builder()
    .baseUrl("https://api.openweathermap.org/")
    .build()