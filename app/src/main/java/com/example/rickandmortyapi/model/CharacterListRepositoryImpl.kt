package com.example.rickandmortyapi.model

import com.example.rickandmortyapi.model.model.CharacterResponse

class CharacterListRepositoryImpl(
    private val apiService: ApiService
) : CharacterListRepository {
    override suspend fun getCharacters() : CharacterResponse {
        return apiService.getCharacters()
    }
}

