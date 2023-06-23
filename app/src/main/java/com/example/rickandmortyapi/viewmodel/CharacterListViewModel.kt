package com.example.rickandmortyapi.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmortyapi.model.CharacterListRepository
import com.example.rickandmortyapi.model.model.ResultResponse
import kotlinx.coroutines.launch

class CharacterListViewModel(
    private val characterListRepository: CharacterListRepository
): ViewModel() {
    private var _charactersLiveData = MutableLiveData<List<ResultResponse>>()
    val charactersLiveData: LiveData<List<ResultResponse>>
        get() = _charactersLiveData

    private var _errorLiveData = MutableLiveData<String>()
    val errorLiveData: LiveData<String>
        get() = _errorLiveData

    private var _loadingLiveData = MutableLiveData<Boolean>()
    val loadingLiveData: LiveData<Boolean>
        get() = _loadingLiveData


    fun getCharacters() {
        _loadingLiveData.value = true
        viewModelScope.launch {
            try {
                val characters = characterListRepository.getCharacters()
                _charactersLiveData.value = characters.results
                _loadingLiveData.value = false
            } catch (e: Exception) {
                _errorLiveData.value = e.message
                _loadingLiveData.value = false
            }
        }
    }
}