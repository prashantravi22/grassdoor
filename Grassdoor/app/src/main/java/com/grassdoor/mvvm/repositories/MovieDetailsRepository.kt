package com.grassdoor.mvvm.repositories

import androidx.lifecycle.LiveData
import com.grassdoor.mvvm.requests.MovieAPIClient
import com.grassdoor.mvvm.models.Details

//
class MovieDetailsRepository private constructor() {
    private val movieAPIClient: MovieAPIClient = MovieAPIClient()
    val isRequestTimeOut: LiveData<Boolean>
        get() = movieAPIClient.isRequestTimeOut()
    val movieDetails: LiveData<Details?>
        get() = movieAPIClient.movieDetails

    fun searchMovieDetails(movieID: Int) {
        movieAPIClient.searchMovieID(movieID)
    }

    companion object {
        var instance: MovieDetailsRepository? = null
            get() {
                if (field == null) {
                    field = MovieDetailsRepository()
                }
                return field
            }
            private set
    }

}