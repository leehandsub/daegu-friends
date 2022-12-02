package com.example.daegucocktail.api

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query
import com.example.daegucocktail.data.SearchResponse
import com.example.daegucocktail.data.SortOption

interface StoreService {
    @GET("v2/search/image")
    suspend fun searchImages(
        @Header("Authorization") authorization: String,
        @Query("query") query: String,
        @Query("sort") sort: SortOption = SortOption.accuracy,
        @Query("page") page: Int = 1,
        @Query("size") size: Int = 80
    ): SearchResponse

    companion object {
        private val Json = Json {
            isLenient = true
            ignoreUnknownKeys = true
            coerceInputValues = true
        }

        private const val BASE_URL = "https://dapi.kakao.com/"

        fun create(): StoreService {
            val logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BASIC }
            val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .build()
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
                .build()
                .create(StoreService::class.java)
        }
    }
}