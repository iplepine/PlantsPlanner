package com.zs.app.plants.domain.entity

data class Plant(
    val id: Long,
    val nickName: String,
    val name: String,
    val adaptionDate: String,
    val history: History,
    val profile: String
)
