package com.zs.app.plants.domain.entity

data class Plant(
    val nickName: String,
    val name: String?,
    val startDate: Long,
    val profile: String?,
    val history: List<Record> = ArrayList(),
    val id: Long = 0
)
