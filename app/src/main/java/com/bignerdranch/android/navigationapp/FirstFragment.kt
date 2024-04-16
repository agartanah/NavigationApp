package com.bignerdranch.android.navigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.bignerdranch.android.navigationapp.databinding.FragmentFisrtBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFisrtBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFisrtBinding.inflate(inflater, container, false)

        binding.textView.setOnClickListener() {
            val action = FirstFragmentDirections.actionFisrtFragmentToSecondFragment(133)
            it.findNavController().navigate(action)
        }

        return binding.root
    }
}



