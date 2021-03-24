package com.zs.app.plants.ui.main.model

import androidx.lifecycle.ViewModel
import com.zs.app.plants.data.network.entity.Repository

class RepositoryItemViewModel(val repository: Repository) : ViewModel() {

    fun getName(): String {
        return repository.name
    }

    fun getDescription(): String {
        return repository.description
    }

    fun getStarCount(): String {
        return repository.starCount.toString()
    }

    fun getUpdateDate(): String {
        return repository.update
    }
}