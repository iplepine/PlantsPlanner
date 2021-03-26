package com.zs.app.plants.presentation.ui.common

import androidx.lifecycle.ViewModel
import com.zs.app.plants.data.AppNavigation
import javax.inject.Inject

class NavigationViewModel @Inject constructor(
    val navigation: AppNavigation
) : ViewModel() {

}