package com.example.yutee.weatherforecast.ui.weather.future.datail

import com.example.yutee.weatherforecast.data.provider.UnitProvider
import com.example.yutee.weatherforecast.data.repository.ForecastRepository
import com.example.yutee.weatherforecast.internal.lazyDeferred
import com.example.yutee.weatherforecast.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureDetailWeatherViewModel(
        private val detailDate: LocalDate,
        private val forecastRepository: ForecastRepository,
        unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getFutureWeatherByDate(detailDate, super.isMetricUnit)
    }
}
