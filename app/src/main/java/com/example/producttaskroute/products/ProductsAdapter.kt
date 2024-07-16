package com.example.producttaskroute.products

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.entity.Product
import com.example.producttaskroute.databinding.ItemProductBinding

class ProductsAdapter(var products: List<Product?>? = null) : RecyclerView.Adapter<ProductsAdapter.ViewHolder>(){
    class ViewHolder(val binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(product: Product?){
            binding.product = product
            binding.invalidateAll()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = products?.size ?: 0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val productsList = products!![position]
        holder.bind(productsList)
    }

    fun bindProducts(products: List<Product?>?){
        this.products = products
        notifyDataSetChanged()
    }
}