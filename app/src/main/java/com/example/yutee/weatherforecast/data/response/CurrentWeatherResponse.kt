package com.example.yutee.weatherforecast.data.response

import com.example.yutee.weatherforecast.data.db.entity.CurrentWeatherEntry
import com.example.yutee.weatherforecast.data.db.entity.Location
import com.google.gson.annotations.SerializedName


data class CurrentWeatherResponse(
        @SerializedName("current")
        val currentWeatherEntry: CurrentWeatherEntry,
        val location: Location
)