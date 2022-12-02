package com.example.daegucocktail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import com.example.daegucocktail.adapter.CocktailAdapter
import com.example.daegucocktail.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setContentView(this, R.layout.activity_detail)
        binding.recyclerView.adapter = CocktailAdapter()

        setSupportActionBar(binding.toolbar)
    }
}