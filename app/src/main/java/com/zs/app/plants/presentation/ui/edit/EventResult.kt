package com.zs.app.plants.presentation.ui.edit

sealed class EventResult(val e: Exception? = null) {
    class ErrorMessage(message: String)
        : EventResult(Exception(message))

    class EmptyNickName
        : EventResult(IllegalArgumentException())

    class SuccessCreate
        : EventResult()

    class FailedCreate
        : EventResult()

    class SuccessUpdate
        : EventResult()

    class FailedUpdate
        : EventResult()

    fun isError(): Boolean {
        return e != null
    }
}