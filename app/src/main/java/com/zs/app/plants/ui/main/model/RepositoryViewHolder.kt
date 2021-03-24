package com.zs.app.plants.ui.main.model

import androidx.recyclerview.widget.RecyclerView
import com.zs.app.plants.databinding.ItemRepositoryBinding

class RepositoryViewHolder(private val binding: ItemRepositoryBinding)
    : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: RepositoryItemViewModel) {
        binding.item = item
    }
}