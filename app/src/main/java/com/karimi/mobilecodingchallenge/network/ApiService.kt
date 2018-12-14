package com.karimi.mobilecodingchallenge.network

import com.karimi.mobilecodingchallenge.models.Response
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("search/repositories")
    fun getRepositories(
        @Query("q") date: String,
        @Query("sort") sort: String,
        @Query("order") order: String
    ): Observable<Response>

}