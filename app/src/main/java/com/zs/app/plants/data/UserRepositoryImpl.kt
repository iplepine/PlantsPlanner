package com.zs.app.plants.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.zs.app.plants.domain.entity.User
import com.zs.app.plants.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor() : UserRepository {
    override fun getUser(userID: Long): LiveData<User> {
        return MutableLiveData<User>()
    }
}
