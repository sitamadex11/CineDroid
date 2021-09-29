package com.sitamadex11.cinedroid.domain.usecases

import com.sitamadex11.cinedroid.data.model.Artist
import com.sitamadex11.cinedroid.domain.repository.ArtistRepository

class UpdateArtistUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.updateArtists()
}