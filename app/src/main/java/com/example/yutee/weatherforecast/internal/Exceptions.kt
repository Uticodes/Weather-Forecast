package com.example.yutee.weatherforecast.internal

import java.io.IOException


class NoConnectivityException: IOException()
class LocationPermissionNotGrantedException: Exception()
class DateNotFoundException: Exception()