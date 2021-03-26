package com.zs.app.plants.presentation.ui.main.plant

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class PlantViewModel @Inject constructor(
) : ViewModel() {

    val image = MutableLiveData<String>()
    val nickName = MutableLiveData<String>()
    val name = MutableLiveData<String>()

}