package com.barissemerci.nutrisport

import android.app.Application
import com.google.firebase.Firebase
import com.google.firebase.initialize
import com.nutrisport.di.initializeKoin
import org.koin.android.ext.koin.androidContext

class NutriSportApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initializeKoin(
            config = {
                androidContext(this@NutriSportApplication)
            }
        )
        Firebase.initialize(
            context = this
        )
    }
}