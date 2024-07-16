package com.example.producttaskroute.di

import com.example.data.remote.ApiService
import com.example.data.repo.ProductsRepoImpl
import com.example.domain.repo.ProductsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @Provides
    fun provideRepo(apiService: ApiService): ProductsRepo{
        return ProductsRepoImpl(apiService)
    }
}