package com.example.rickandmortyapi.model.model

import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    @SerializedName("results")
    val results: List<ResultResponse>
)


data class ResultResponse(
    @SerializedName("episode")
    val episode: List<String>,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("location")
    val location: LocationResponse,
    @SerializedName("name")
    val name: String,
    @SerializedName("origin")
    val origin: OriginResponse,
    @SerializedName("species")
    val species: String,
    @SerializedName("status")
    val status: String
)

data class LocationResponse(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)

data class OriginResponse(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)