package com.example.daegucocktail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.daegucocktail.databinding.ActivityStoreBinding
import androidx.databinding.DataBindingUtil.setContentView
import com.example.daegucocktail.viewmodel.StoreViewModel

class StoreActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStoreBinding

    private val storeViewModel: StoreViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setContentView(this, R.layout.activity_store)
        binding.lifecycleOwner = this
        binding.viewModel = storeViewModel

        setSupportActionBar(binding.toolbar)
        binding.bMenu.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }
}