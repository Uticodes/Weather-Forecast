package com.example.yutee.weatherforecast.data.provider

import com.example.yutee.weatherforecast.internal.UnitSystem


interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}