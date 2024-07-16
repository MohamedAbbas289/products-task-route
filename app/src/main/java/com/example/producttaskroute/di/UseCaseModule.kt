package com.example.producttaskroute.di

import com.example.data.repo.ProductsRepoImpl
import com.example.domain.usecase.GetProducts
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideUseCase(repoImpl: ProductsRepoImpl): GetProducts {
        return GetProducts(repoImpl)
    }
}