package com.example.domain

interface GitHubRepository {

    suspend fun searchRepositories(
        q: String = "",
        perPage: Int = 0,
        page: Int = 0
    ): GitHubContent
}