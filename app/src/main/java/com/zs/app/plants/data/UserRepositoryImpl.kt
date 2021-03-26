package com.zs.app.plants.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.zs.app.plants.domain.entity.User
import com.zs.app.plants.domain.repository.UserRepository

class UserRepositoryImpl: UserRepository {
    override fun getUser(userID: Long): LiveData<User> {
        return MutableLiveData<User>()
    }
}
