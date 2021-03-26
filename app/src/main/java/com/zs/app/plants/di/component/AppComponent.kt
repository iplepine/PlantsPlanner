package com.zs.app.plants.di.component

import com.zs.app.plants.di.module.AppModule
import com.zs.app.plants.presentation.ui.edit.EditPlantFragment
import com.zs.app.plants.presentation.ui.main.MainActivity
import com.zs.app.plants.presentation.ui.main.MainFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class
    ]
)
interface AppComponent {

    fun injectActivity(activity: MainActivity)
    fun injectMainFragment(fragment: MainFragment)
    fun injectEditFragment(fragment: EditPlantFragment)

}