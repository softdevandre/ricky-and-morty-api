package com.example.rickandmortyapi.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmortyapi.model.MainActivityRepository
import kotlinx.coroutines.launch

class MainActivityViewModel(
    private val MainActivityRepository: MainActivityRepository
): ViewModel() {
    fun getUsers() {
        viewModelScope.launch {
            try {
                val users = MainActivityRepository.getCharacters()
                // Faça algo com a lista de personagens recebida
            } catch (e: Exception) {
                // Lida com qualquer exceção que possa ocorrer
            }
        }
    }
}