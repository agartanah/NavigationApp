package com.bignerdranch.android.navigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.bignerdranch.android.navigationapp.databinding.FragmentFisrtBinding
import com.bignerdranch.android.navigationapp.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        val numberSecond = args.number
        binding.textView2.setText(numberSecond.toString())

        binding.textView2.setOnClickListener() {
            it.findNavController().navigate(R.id.fisrtFragment)
        }

        return binding.root
    }
}



