package com.example.myapplication.di

import com.example.data.GitHubService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {

    @Singleton
    @Provides
    fun provideGitHubService(retrofit: Retrofit): GitHubService{
        return retrofit.create(GitHubService::class.java)
    }
}