package com.example.moviesapp.model.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "popular_movies_tbl")
data class PopularMovieEntity(

    @PrimaryKey val id: Int,
    val adult: Boolean,
    val backdrop_path: String,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int,
    val category:String,
    val page:Int
)
