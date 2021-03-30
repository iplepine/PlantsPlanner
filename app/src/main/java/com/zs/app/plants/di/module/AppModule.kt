package com.zs.app.plants.di.module

import android.content.Context
import android.content.res.Resources
import com.zs.app.plants.R
import com.zs.app.plants.data.AppNavigation
import com.zs.app.plants.data.PlantRepositoryImpl
import com.zs.app.plants.data.UserRepositoryImpl
import com.zs.app.plants.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
abstract class AppModule(private val context: Context) {

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

    // Binds를 통해 바로 연결해줄 수 있다.
    @Singleton
    @Binds
    abstract fun bindUserRepository(repository: UserRepositoryImpl): UserRepository

    // Provides 를 통해 직접 생성하거나 빌더패턴을 통해 생성해서 넘겨줄 수도 있다.
    @Singleton
    @Provides
    fun providePlantRepository() = PlantRepositoryImpl()
}
