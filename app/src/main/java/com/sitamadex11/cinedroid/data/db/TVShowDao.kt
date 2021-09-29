package com.sitamadex11.cinedroid.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sitamadex11.cinedroid.data.model.TVShow

@Dao
interface TVShowDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTVShows(movies:List<TVShow>)

    @Query("Delete from popular_show")
    suspend fun deleteAllTVShows()

    @Query("select * from popular_show")
    suspend fun getAllTVShows():List<TVShow>
}