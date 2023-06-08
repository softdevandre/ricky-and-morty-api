package com.example.rickandmortyapi.model

import retrofit2.http.GET

interface ApiService {

    @GET("api/character")
    suspend fun getCharacters() : List<CharacterResponse>
}