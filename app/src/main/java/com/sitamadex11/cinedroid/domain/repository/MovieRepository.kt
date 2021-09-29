package com.sitamadex11.cinedroid.domain.repository

import com.sitamadex11.cinedroid.data.model.Movie

interface MovieRepository {
    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?
}