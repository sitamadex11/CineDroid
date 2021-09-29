package com.sitamadex11.cinedroid.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sitamadex11.cinedroid.data.model.Movie

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovies(movies:List<Movie>)

    @Query("Delete from popular_movie")
    suspend fun deleteAllMovies()

    @Query("select * from popular_movie")
    suspend fun getAllMovies():List<Movie>
}