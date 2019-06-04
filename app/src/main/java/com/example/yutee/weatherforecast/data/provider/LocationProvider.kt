package com.example.yutee.weatherforecast.data.provider

import com.example.yutee.weatherforecast.data.db.entity.WeatherLocation


interface LocationProvider {
    suspend fun hasLocationChanged(lastWeatherLocation: WeatherLocation): Boolean
    suspend fun getPreferredLocationString(): String
}