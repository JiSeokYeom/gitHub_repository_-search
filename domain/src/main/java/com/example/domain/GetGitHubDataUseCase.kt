package com.example.domain

import javax.inject.Inject

class GetGitHubDataUseCase @Inject constructor(
    private val getHubRepository: GitHubRepository
) {
    suspend fun searchRepositories(
        q: String = "",
        perPage: Int = 0,
        page: Int = 0
    ): Result<GitHubContent> {
       return runCatching {
            getHubRepository.searchRepositories(
                q = q,
                perPage = perPage,
                page = page
            )
        }.onSuccess {
            return Result.success(it)
        }.onFailure {
            return Result.failure(it)
        }
    }
}