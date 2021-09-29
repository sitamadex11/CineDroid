package com.sitamadex11.cinedroid.domain.usecases

import com.sitamadex11.cinedroid.data.model.Movie
import com.sitamadex11.cinedroid.data.model.TVShow
import com.sitamadex11.cinedroid.domain.repository.ArtistRepository
import com.sitamadex11.cinedroid.domain.repository.TVShowRepository

class GetTVShowUseCase(private val tvShowRepository: TVShowRepository) {
    suspend fun execute():List<TVShow>? = tvShowRepository.getTVShows()
}