package com.zs.app.plants.di.component

import com.zs.app.plants.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        AppModule::class
    ]
)
interface AppComponent {

}