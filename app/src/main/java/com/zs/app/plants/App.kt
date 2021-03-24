package com.zs.app.plants

import android.app.Application
import com.zs.app.plants.data.ResourceHelper

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        ResourceHelper.init(applicationContext)
    }
}