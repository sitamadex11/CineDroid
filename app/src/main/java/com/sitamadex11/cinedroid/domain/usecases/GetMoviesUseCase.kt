package com.sitamadex11.cinedroid.domain.usecases

import com.sitamadex11.cinedroid.data.model.Movie
import com.sitamadex11.cinedroid.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.getMovies()
}