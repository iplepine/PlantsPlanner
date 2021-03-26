package com.zs.app.plants.presentation.ui.edit

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zs.app.plants.PlantsApp
import com.zs.app.plants.databinding.EditPlantFragmentBinding
import com.zs.app.plants.presentation.ui.base.BaseFragment
import javax.inject.Inject

class EditPlantFragment: BaseFragment() {

    lateinit var binding: EditPlantFragmentBinding

    @Inject
    lateinit var viewModel: PlantViewModel

    override fun onAttach(context: Context) {
        PlantsApp.appComponent.injectEditFragment(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = EditPlantFragmentBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        if (savedInstanceState == null) {
            // TODO do what?
        }
        return binding.root
    }
}