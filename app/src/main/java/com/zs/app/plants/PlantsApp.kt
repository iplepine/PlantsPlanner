package com.zs.app.plants

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class PlantsApp : Application() {
    
    override fun onCreate() {
        super.onCreate()
    }

}