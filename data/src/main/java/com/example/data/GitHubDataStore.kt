package com.example.data

import com.example.domain.GitHubResponse
import retrofit2.Response

interface GitHubDataStore {

    suspend fun searchRepositories(
        q: String = "",
        perPage: Int = 0,
        page: Int = 0
    ): Response<GitHubResponse>
}