package com.zs.app.plants.presentation.ui.edit

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.zs.app.plants.data.common.NonNullLiveData
import com.zs.app.plants.data.common.SingleLiveEvent
import com.zs.app.plants.domain.entity.Plant
import com.zs.app.plants.domain.repository.PlantRepository
import com.zs.app.plants.presentation.ui.base.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class PlantViewModel @Inject constructor(
    private val plantRepository: PlantRepository
): BaseViewModel() {

    enum class Mode { CREATE, EDIT }

    val mode = NonNullLiveData(Mode.CREATE)

    val nickName = NonNullLiveData("")
    val name = MutableLiveData<String>("")
    val startDate = MutableLiveData<Long>(System.currentTimeMillis())
    val profile = MutableLiveData<String>()

    val eventResult = SingleLiveEvent<EventResult>()

    fun onClickOkayButton(view: View) {
        if (isInvalidInput()) {
            eventResult.value = EventResult.EmptyNickName()
            return
        }

        if (mode.value == Mode.CREATE) {
            createPlant()
        } else {
            updatePlant()
        }
    }

    private fun isInvalidInput(): Boolean {
        return nickName.value.isNullOrEmpty()
    }

    private fun createPlant() {
        val plant = parsePlantEntity()
        viewModelScope.launch (Dispatchers.IO) {
            val id = plantRepository.add(plant)
            if (id > 0) {
                eventResult.postValue(EventResult.SuccessCreate())
            } else {
                eventResult.postValue(EventResult.FailedCreate())
            }
        }
    }

    private fun updatePlant() {
        val plant = parsePlantEntity()
        viewModelScope.launch (Dispatchers.IO) {
            val updated = plantRepository.update(plant)
            if (updated) {
                eventResult.postValue(EventResult.SuccessUpdate())
            } else {
                eventResult.postValue(EventResult.FailedUpdate())
            }
        }
    }

    private fun parsePlantEntity(): Plant {
        return Plant(nickName.value, name.value, startDate.value?:0, profile.value)
    }
}