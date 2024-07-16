package com.example.data.remote

import com.example.domain.entity.ProductResponse
import retrofit2.http.GET

interface ApiService {
    @GET("products")
    suspend fun getProducts(): ProductResponse
}