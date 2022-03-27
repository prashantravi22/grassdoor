package com.grassdoor.mvvm.ViewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.grassdoor.mvvm.models.Result
import com.grassdoor.mvvm.repositories.MovieRepository

class MovieListViewModel : ViewModel() {
    private val movieRepository: MovieRepository = MovieRepository
    var isMovieRetrieved = false

    fun searchNextPage() {
        movieRepository.searchNextQuery()
    }

    val movies: LiveData<List<Result>>
        get() = movieRepository.movies

    fun searchMovieAPI(query: String, page: Int) {
        movieRepository.searchMovieAPI(query, page)
    }

    val isRequestTimedOut: LiveData<Boolean>
        get() = movieRepository.isRequestTimedOut

}