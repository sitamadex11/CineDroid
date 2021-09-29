package com.sitamadex11.cinedroid.domain.repository

import com.sitamadex11.cinedroid.data.model.Movie
import com.sitamadex11.cinedroid.data.model.TVShow

interface TVShowRepository {
    suspend fun getTVShows():List<TVShow>?
    suspend fun updateTVShows():List<TVShow>?
}