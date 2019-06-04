package com.example.yutee.weatherforecast.data.network.response

import com.example.yutee.weatherforecast.data.db.entity.WeatherLocation
import com.google.gson.annotations.SerializedName

data class FutureWeatherResponse(
    @SerializedName("forecast")
    val futureWeatherEntries: ForecastDaysContainer,
    val location: WeatherLocation
)