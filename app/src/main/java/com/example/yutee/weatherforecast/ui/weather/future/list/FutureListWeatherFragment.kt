package com.example.yutee.weatherforecast.ui.weather.future.list

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.yutee.weatherforecast.R

class FutureListWeatherFragment : Fragment() {

    companion object {
        fun newInstance() = FutureListWeatherFragment()
    }

    private lateinit var viewModel: FutureListWeatherViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.future_list_weather_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FutureListWeatherViewModel::class.java)

    }

}
