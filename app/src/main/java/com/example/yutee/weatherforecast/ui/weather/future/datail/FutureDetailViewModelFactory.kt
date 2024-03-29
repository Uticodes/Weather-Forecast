package com.example.yutee.weatherforecast.ui.weather.future.datail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.yutee.weatherforecast.data.provider.UnitProvider
import com.example.yutee.weatherforecast.data.repository.ForecastRepository
import org.threeten.bp.LocalDate


class FutureDetailWeatherViewModelFactory(
        private val detailDate: LocalDate,
        private val forecastRepository: ForecastRepository,
        private val unitProvider: UnitProvider
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FutureDetailWeatherViewModel(detailDate, forecastRepository, unitProvider) as T
    }
}