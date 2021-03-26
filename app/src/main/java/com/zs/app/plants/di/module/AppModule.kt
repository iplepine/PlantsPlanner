package com.zs.app.plants.di.module

import android.content.Context
import android.content.res.Resources
import com.zs.app.plants.R
import com.zs.app.plants.data.AppNavigation
import com.zs.app.plants.data.PlantRepositoryImpl
import com.zs.app.plants.data.UserRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val context: Context) {

    @Singleton
    @Provides
    fun provideContext() = context.applicationContext

    @Singleton
    @Provides
    fun provideResource(context: Context) = context.resources

    @Singleton
    @Provides
    fun provideNavigation(resource: Resources): AppNavigation {
        return AppNavigation(resource.getString(R.string.app_name))
    }

    @Singleton
    @Provides
    fun provideUserRepository() = UserRepositoryImpl()

    @Singleton
    @Provides
    fun providePlantRepository() = PlantRepositoryImpl()
}
