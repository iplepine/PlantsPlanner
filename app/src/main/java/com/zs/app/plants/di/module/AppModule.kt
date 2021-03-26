package com.zs.app.plants.di.module

import android.content.Context
import android.content.res.Resources
import com.zs.app.plants.R
import com.zs.app.plants.data.AppNavigation
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val context: Context) {

    @Singleton
    @Provides
    fun provideContext(): Context {
        return context.applicationContext
    }

    @Singleton
    @Provides
    fun provideResource(context: Context): Resources {
        return context.resources
    }

    @Singleton
    @Provides
    fun provideNavigation(resource: Resources): AppNavigation {
        return AppNavigation(resource.getString(R.string.app_name))
    }

}
