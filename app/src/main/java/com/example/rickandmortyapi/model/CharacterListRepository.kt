package com.example.rickandmortyapi.model

import com.example.rickandmortyapi.model.model.CharacterResponse

interface CharacterListRepository {

    suspend fun getCharacters() : CharacterResponse

}