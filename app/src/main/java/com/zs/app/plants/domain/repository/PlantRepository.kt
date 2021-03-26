package com.zs.app.plants.domain.repository

import com.zs.app.plants.domain.entity.Plant

interface PlantRepository {

    fun getAllPlants(userID: String): List<Plant>
    fun getPlant(plantId: Long): Plant
    fun update(plant: Plant): Boolean

}