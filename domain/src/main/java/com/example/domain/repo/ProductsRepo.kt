package com.example.domain.repo

import com.example.domain.entity.ProductResponse

interface ProductsRepo {
    suspend fun getProducts(): ProductResponse
}