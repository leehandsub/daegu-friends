package com.example.daegucocktail.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.daegucocktail.api.StoreService
import com.example.daegucocktail.data.CocktailStore
import com.example.daegucocktail.data.StoreRepository
import kotlinx.coroutines.launch

class StoreViewModel : ViewModel() {
    private val repository = StoreRepository(StoreService.create())

    val store: CocktailStore = CocktailStore(
        id = 0,
        lat = 35.8576878,
        lon = 128.6249414,
        image = "https://steemitimages.com/p/D5zH9SyxCKdBnJYQyaebMQPwHbaaEehBwt8K5GY6dnWJTWVdiJ18ZXVqeafuUUQqdUABRxRkRrH25GSwZXyPe4s97toFQuZinB5EKvVsAzn3ABxUHu9xDJWK2UGCfySefDh2DC?format=match&mode=fit&width=640",
        title = "플레어문",
        storeInfo = "동성로에 위치한 야경이 황홀한 칵테일바 입니다. 크리스마스 시즌을 위한 매장 실내 리모델링을 마쳤습니다. 좋은 연휴에 함께하기 좋은 칵테일바가 되겠습니다. 감사합니다."
    )

    fun search(query: String) {
        viewModelScope.launch {
            val response = repository.searchImage(query)

            Log.e("TEST", "$response")
        }
    }
}