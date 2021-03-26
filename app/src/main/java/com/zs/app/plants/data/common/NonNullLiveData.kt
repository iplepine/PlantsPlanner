package com.zs.app.plants.data.common

import androidx.lifecycle.MutableLiveData

open class NonNullLiveData<T>(default: T) : MutableLiveData<T>(default) {
    override fun getValue(): T {
        return super.getValue()!!
    }
}