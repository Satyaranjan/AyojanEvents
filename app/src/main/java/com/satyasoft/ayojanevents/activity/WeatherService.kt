package com.satyasoft.ayojanevents.activity

import com.androimads.retrolin.WeatherResponse
import retrofit2.Call
import retrofit2.http.*

/**
 * Created by anupamchugh on 09/01/17.
 */
interface WeatherService {
        @GET("data/2.5/weather?")
        fun getCurrentWeatherData(@Query("lat") lat: String, @Query("lon") lon: String, @Query("APPID") app_id: String): Call<WeatherResponse>

}