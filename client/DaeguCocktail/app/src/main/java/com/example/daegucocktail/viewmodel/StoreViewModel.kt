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
        storeInfo = "동성로에 위치한 야경이 황홀한 칵테일바 입니다. 크리스마스 시즌을 위한 매장 실내 리모델링을 마쳤습니다. 칵테일뿐만 아니라 칵테일과 잘 어울리는 안주인 까망베르치즈와 스위스 초콜릿을 해외에서 직수입하여 손님들에게 대접합니다. 좋은 연휴에 함께하기 좋은 칵테일바가 되겠습니다. 감사합니다."
    )

    fun search(query: String) {
        viewModelScope.launch {
            val response = repository.searchImage(query)

            Log.e("TEST", "$response")
        }
    }
}