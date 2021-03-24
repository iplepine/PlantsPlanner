package com.zs.app.plants.domain.entity

data class History(
    val id: Long,
    val time: Long,
    val description: String,
    val images: List<String>
)
