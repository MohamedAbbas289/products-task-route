package com.example.data.repo

import com.example.data.remote.ApiService
import com.example.domain.entity.ProductResponse
import com.example.domain.repo.ProductsRepo

class ProductsRepoImpl(private val apiService: ApiService): ProductsRepo {
    override suspend fun getProducts(): ProductResponse {
        return apiService.getProducts()
    }
}