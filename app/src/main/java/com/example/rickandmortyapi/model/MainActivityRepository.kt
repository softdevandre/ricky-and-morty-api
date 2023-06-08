package com.example.rickandmortyapi.model

class MainActivityRepository(
    private val apiService: ApiService
) {
    suspend fun getCharacters() : List<CharacterResponse> {
        return apiService.getCharacters()
    }
}