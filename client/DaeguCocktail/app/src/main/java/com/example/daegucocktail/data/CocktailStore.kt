package com.example.daegucocktail.data

data class CocktailStore(
    val id: Int,
    val lat: Double,
    val lon: Double,
    val image: String,
    val title: String,
    val storeInfo: String
)