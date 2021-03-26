package com.zs.app.plants.presentation.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zs.app.plants.PlantsApp
import com.zs.app.plants.R
import com.zs.app.plants.databinding.MainActivityBinding
import com.zs.app.plants.presentation.ui.toolbar.ToolbarViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var toolbarViewModel: ToolbarViewModel

    lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        PlantsApp.appComponent.injectActivity(this)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbarViewModel = toolbarViewModel
        binding.lifecycleOwner = this

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment())
                    .commitNow()
        }
    }
}