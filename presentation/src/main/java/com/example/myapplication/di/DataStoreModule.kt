package com.example.myapplication.di

import com.example.data.GitHubDataStore
import com.example.data.GitHubDataStoreImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataStoreModule {

    @Binds
    abstract fun bindGitHubDataStore(
        gitHubDataStoreImpl: GitHubDataStoreImpl
    ): GitHubDataStore


}