package com.sitamadex11.cinedroid.domain.repository

import com.sitamadex11.cinedroid.data.model.Artist
import com.sitamadex11.cinedroid.data.model.TVShow

interface ArtistRepository {
    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}