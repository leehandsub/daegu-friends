package com.example.daegucocktail

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import com.example.daegucocktail.adapter.CocktailAdapter
import com.example.daegucocktail.databinding.ActivityDetailBinding
import com.example.daegucocktail.viewmodel.DetailViewModel

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    private val detailViewModel: DetailViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setContentView(this, R.layout.activity_detail)
        binding.lifecycleOwner = this
        binding.viewModel = detailViewModel
        binding.recyclerView.adapter = CocktailAdapter()

        setSupportActionBar(binding.toolbar)
    }
}