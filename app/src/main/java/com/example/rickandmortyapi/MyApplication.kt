package com.example.rickandmortyapi

import android.app.Application
import com.example.rickandmortyapi.di.modelModule
import com.example.rickandmortyapi.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(modelModule, viewModelModule)
        }
    }

}