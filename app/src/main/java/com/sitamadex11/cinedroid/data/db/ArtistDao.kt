package com.sitamadex11.cinedroid.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sitamadex11.cinedroid.data.model.Artist

@Dao
interface ArtistDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveArtists(movies:List<Artist>)

    @Query("Delete from popular_artist")
    suspend fun deleteAllArtists()

    @Query("select * from popular_artist")
    suspend fun getAllArtists():List<Artist>
}