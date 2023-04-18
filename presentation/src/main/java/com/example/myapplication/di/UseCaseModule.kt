package com.example.myapplication.di

import com.example.domain.GetGitHubDataUseCase
import com.example.domain.GitHubRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Singleton
    @Provides
    fun provideGitHubDataUseCase(
        gitHubRepository: GitHubRepository
    ): GetGitHubDataUseCase{
        return GetGitHubDataUseCase(gitHubRepository)
    }
}