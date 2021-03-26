package com.zs.app.plants.presentation.ui.base

import androidx.lifecycle.ViewModel
import com.zs.app.plants.data.common.SingleLiveEvent

open class BaseViewModel: ViewModel() {
    val error = SingleLiveEvent<Exception>()
}