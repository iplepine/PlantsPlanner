package com.zs.app.plants.presentation.ui.main

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zs.app.plants.PlantsApp
import com.zs.app.plants.R
import com.zs.app.plants.databinding.MainFragmentBinding
import com.zs.app.plants.presentation.ui.base.BaseFragment
import com.zs.app.plants.presentation.ui.edit.EditPlantFragment
import javax.inject.Inject

class MainFragment : BaseFragment() {

    private lateinit var binding: MainFragmentBinding

    @Inject
    lateinit var viewModel: MainViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        PlantsApp.appComponent.injectMainFragment(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(inflater)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initViewModel()
        initViews()
    }

    private fun initViewModel() {
        //viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.viewModel = viewModel
    }

    private fun initViews() {
        binding.newButton.setOnClickListener {
            if (isAdded) {
                fragmentManager?.apply {
                    beginTransaction()
                        .replace(R.id.container, EditPlantFragment())
                        .commit()
                }
            }
        }
    }
}