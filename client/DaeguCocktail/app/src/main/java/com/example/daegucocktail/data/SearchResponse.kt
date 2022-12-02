package com.example.daegucocktail.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchResponse(val documents: List<Document>, val meta: Meta)

@Serializable
data class Meta(
    @SerialName("is_end") val isEnd: Boolean,
    @SerialName("pageable_count") val pageableCount: Int,
    @SerialName("total_count") val totalCount: Int
)

enum class SortOption {
    accuracy, recency
}