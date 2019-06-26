package com.example.yutee.weatherforecast.ui.base

import androidx.lifecycle.ViewModel
import com.example.yutee.weatherforecast.data.provider.UnitProvider
import com.example.yutee.weatherforecast.data.repository.ForecastRepository
import com.example.yutee.weatherforecast.internal.UnitSystem
import com.example.yutee.weatherforecast.internal.lazyDeferred


abstract class WeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {

    private val unitSystem = unitProvider.getUnitSystem()

    val isMetricUnit: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}