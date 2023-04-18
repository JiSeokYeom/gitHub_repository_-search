package com.example.data

import com.example.domain.GitHubResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GitHubService {

    @GET("/search/repositories")
   suspend fun searchRepositories(
        @Query("q") q: String,
        @Query("per_page") perPage: Int,
        @Query("page") page: Int
    ): Response<GitHubResponse>
}