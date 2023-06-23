package com.example.rickandmortyapi.model.model

import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    @SerializedName("results")
    val results: List<ResultResponse>
)


data class ResultResponse(
    // TODO: Add SerializedName annotation to all fields
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: LocationResponse,
    val name: String,
    val origin: OriginResponse,
    val species: String,
    val status: String
)

data class LocationResponse(
    // TODO: Add SerializedName annotation to all fields
    val name: String,
    val url: String
)

data class OriginResponse(
    // TODO: Add SerializedName annotation to all fields
    val name: String,
    val url: String
)