package com.example.rickandmortyapi.model

import com.example.rickandmortyapi.model.model.CharacterResponse
import retrofit2.http.GET

interface ApiService {

    @GET("api/character")
    suspend fun getCharacters() : CharacterResponse
}