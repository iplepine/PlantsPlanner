package com.zs.app.plants.domain.repository

import androidx.lifecycle.LiveData
import com.zs.app.plants.domain.entity.User

interface UserRepository {

    open fun getUser(userID: Long): LiveData<User>

}