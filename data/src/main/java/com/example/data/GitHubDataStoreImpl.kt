package com.example.data

import com.example.domain.GitHubResponse
import retrofit2.Response
import javax.inject.Inject

class GitHubDataStoreImpl @Inject constructor(
    private val gitHubService: GitHubService
): GitHubDataStore {

    override suspend fun searchRepositories(
        q: String,
        perPage: Int,
        page: Int
    ): Response<GitHubResponse> {
        return gitHubService.searchRepositories(
            q = q,
            perPage = perPage,
            page = page
        )
    }
}