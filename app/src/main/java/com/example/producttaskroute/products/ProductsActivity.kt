package com.example.producttaskroute.products

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.producttaskroute.databinding.ActivityProductsBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class ProductsActivity : AppCompatActivity() {
    private val viewModel: ProductsViewModel by viewModels()
    private lateinit var binding: ActivityProductsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rv = binding.productsRecyclerView
        viewModel.getProducts()
        val productsAdapter = ProductsAdapter()
        lifecycleScope.launch {
            viewModel.products.collect {
                productsAdapter.bindProducts(it?.products)
                rv.adapter = productsAdapter
            }
        }
    }
}