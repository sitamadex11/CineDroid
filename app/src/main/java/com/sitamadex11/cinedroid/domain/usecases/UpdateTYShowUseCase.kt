package com.sitamadex11.cinedroid.domain.usecases

import com.sitamadex11.cinedroid.data.model.TVShow
import com.sitamadex11.cinedroid.domain.repository.TVShowRepository

class UpdateTYShowUseCase(private val tvShowRepository: TVShowRepository) {
    suspend fun execute():List<TVShow>? = tvShowRepository.updateTVShows()
}