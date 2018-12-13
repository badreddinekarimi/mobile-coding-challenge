package com.karimi.mobilecodingchallenge.network

import com.karimi.mobilecodingchallenge.models.Response
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {

    @GET("search/repositories?q=created:>2017-10-22&sort=stars&order=desc")
    fun getRepositories(): Observable<Response>

}