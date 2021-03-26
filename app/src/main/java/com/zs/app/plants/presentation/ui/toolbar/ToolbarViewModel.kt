package com.zs.app.plants.presentation.ui.toolbar

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zs.app.plants.di.scope.ActivityScope
import javax.inject.Inject

@ActivityScope
class ToolbarViewModel @Inject constructor(

) : ViewModel() {

    val title =  MutableLiveData<String>()

}