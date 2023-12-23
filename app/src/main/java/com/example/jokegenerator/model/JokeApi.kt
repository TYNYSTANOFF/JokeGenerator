package com.example.jokegenerator.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface JokeApi {
    @GET("random/joke")
    fun getRandomJoke(
        @Header("X-RapidAPI-Key") key: String = "c1ce281922mshc88127904e9fac7p1725b1jsn9e2910845d9c",
        @Header("X-RapidAPI-Host") host: String = "dad-jokes.p.rapidapi.com"
    ): Call<JokeModel>
}
//не написал куэри, где гет не написал