package com.example.moviesapp.model.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TrendingMoviesAndTvShowsEntity(
    @PrimaryKey val id: Int,
    val adult: Boolean,
    val backdrop_path: String,
    val first_air_date: String,
    val media_type: String,
    val name: String,
    val original_language: String,
    val original_name: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int,
    val categories:String
)
