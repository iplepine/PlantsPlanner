package com.zs.app.plants.data

import com.zs.app.plants.domain.entity.Plant
import com.zs.app.plants.domain.repository.PlantRepository

class PlantRepositoryImpl: PlantRepository {
    override fun getAllPlants(userID: String): List<Plant> {
        return ArrayList()
    }

    override fun getPlant(plantId: Long): Plant? {
        return null
    }

    override fun add(plant: Plant): Long {
        return -1
    }

    override fun update(plant: Plant): Boolean {
        return false
    }
}