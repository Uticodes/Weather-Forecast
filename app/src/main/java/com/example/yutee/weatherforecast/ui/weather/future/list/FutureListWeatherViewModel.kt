package com.example.yutee.weatherforecast.ui.weather.future.list

import android.arch.lifecycle.ViewModel;
import com.example.yutee.weatherforecast.data.provider.UnitProvider
import com.example.yutee.weatherforecast.data.repository.ForecastRepository
import com.example.yutee.weatherforecast.internal.lazyDeferred
import com.example.yutee.weatherforecast.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureListWeatherViewModel(
        private val forecastRepository: ForecastRepository,
        unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weatherEntries by lazyDeferred {
        forecastRepository.getFutureWeatherList(LocalDate.now(), super.isMetricUnit)
    }
}
