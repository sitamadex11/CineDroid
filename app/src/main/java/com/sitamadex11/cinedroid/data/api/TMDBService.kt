package com.sitamadex11.cinedroid.data.api

import com.sitamadex11.cinedroid.data.ArtistList
import com.sitamadex11.cinedroid.data.MovieList
import com.sitamadex11.cinedroid.data.TVShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovieList(@Query("api_key") apiKey: String): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTVShowList(@Query("api_key") apiKey: String): Response<TVShowList>

    @GET("person/popular")
    suspend fun getPopularPeopleList(@Query("api_key") apiKey: String): Response<ArtistList>

}