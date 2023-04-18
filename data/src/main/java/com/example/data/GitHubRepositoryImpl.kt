package com.example.data

import com.example.domain.GitHubContent
import com.example.domain.GitHubRepository
import com.example.domain.GitHubResponse
import com.example.domain.ItemContent
import javax.inject.Inject

class GitHubRepositoryImpl @Inject constructor(
    private val gitHubDataStore: GitHubDataStore
): GitHubRepository {
    override suspend fun searchRepositories(q: String, perPage: Int, page: Int): GitHubContent {
        return gitHubDataStore.searchRepositories(
            q = q,
            perPage = perPage,
            page = page
        ).body()!!.run(GitHubContent::of)

    }
}