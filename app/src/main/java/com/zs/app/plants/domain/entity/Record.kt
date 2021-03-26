package com.zs.app.plants.domain.entity

data class Record(
    val id: Long,
    val time: Long,
    val description: String,
    val images: List<String>
)
