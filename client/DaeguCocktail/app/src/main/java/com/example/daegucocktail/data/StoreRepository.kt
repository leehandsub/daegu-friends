package com.example.daegucocktail.data
import com.example.daegucocktail.api.StoreService

class StoreRepository(private val service: StoreService) {
    suspend fun searchImage(query: String): SearchResponse {
        return service.searchImages(
            authorization = "KakaoAK 78fef473a8c0e6578740fd761f29e197",
            query = query,
            sort = SortOption.accuracy,
            page = 1,
            size = 80
        )
    }
}