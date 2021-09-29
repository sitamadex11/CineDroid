package com.sitamadex11.cinedroid.data.db

import androidx.room.Database
import com.sitamadex11.cinedroid.data.model.*

@Database(entities = [Movie::class,TVShow::class,Artist::class],
version = 1,
exportSchema = false)
abstract class TMDBDatabase {
    abstract fun movieDao(): MovieDao
    abstract fun tvShowDao(): TVShowDao
    abstract fun ArtistDao(): ArtistDao
}