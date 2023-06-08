package com.example.rickandmortyapi.di

import com.example.rickandmortyapi.model.ApiService
import com.example.rickandmortyapi.model.MainActivityRepository
import com.example.rickandmortyapi.viewmodel.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val modelModule = module {
    single {
        Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single { get<Retrofit>().create(ApiService::class.java) }
    factory { MainActivityRepository(get()) }
}

val viewModelModule = module {
    viewModel { MainActivityViewModel(get()) }
}