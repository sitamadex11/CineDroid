package com.sitamadex11.cinedroid.domain.usecases

import com.sitamadex11.cinedroid.data.model.Artist
import com.sitamadex11.cinedroid.domain.repository.ArtistRepository

class GetArtistUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.getArtists()
}