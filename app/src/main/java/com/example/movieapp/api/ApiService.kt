package com.example.movieapp.api

import com.example.movieapp.response.MovieListResponse
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call

interface ApiService {
    @GET("movie/popular")
    fun getPopularMovie(@Query("page") page : Int) : Call <MovieListResponse>
}