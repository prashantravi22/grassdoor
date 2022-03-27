package com.grassdoor.mvvm.ViewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.grassdoor.mvvm.models.Details
import com.grassdoor.mvvm.repositories.MovieDetailsRepository

class MovieDetailsViewModel : ViewModel() {
    var isMovieRetrieved = false
    private val movieRepository: MovieDetailsRepository = MovieDetailsRepository.instance!!
    val movieDetails: LiveData<Details?>
        get() = movieRepository.movieDetails

    fun searchMovieDetails(movieID: Int) {
        movieRepository.searchMovieDetails(movieID)
    }

    val isRequestTimedOut: LiveData<Boolean>
        get() = movieRepository.isRequestTimeOut

}