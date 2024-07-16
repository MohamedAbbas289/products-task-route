package com.example.domain.usecase

import com.example.domain.repo.ProductsRepo

class GetProducts(private val productsRepo: ProductsRepo) {
    suspend operator fun invoke() = productsRepo.getProducts()
}