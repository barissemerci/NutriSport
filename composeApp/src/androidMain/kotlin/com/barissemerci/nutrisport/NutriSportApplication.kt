package com.barissemerci.nutrisport

import android.app.Application
import com.google.firebase.Firebase
import com.google.firebase.initialize

class NutriSportApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Firebase.initialize(
            context = this
        )
    }
}