package com.example.yutee.weatherforecast.ui.weather.current

import android.arch.lifecycle.ViewModel;
import androidx.lifecycle.LiveData
import com.example.yutee.weatherforecast.data.db.unitlocalized.current.UnitSpecificCurrentWeatherEntry
import com.example.yutee.weatherforecast.data.provider.UnitProvider
import com.example.yutee.weatherforecast.data.repository.ForecastRepository
import com.example.yutee.weatherforecast.internal.lazyDeferred
import com.example.yutee.weatherforecast.ui.base.WeatherViewModel
import kotlinx.coroutines.Deferred

class CurrentWeatherViewModel(
        private val forecastRepository: ForecastRepository,
        unitProvider: UnitProvider): WeatherViewModel(forecastRepository, unitProvider) {

    val weather  by lazyDeferred {
        forecastRepository.getCurrentWeather(super.isMetricUnit)
    }

}
