package com.example.nav_graph_classwork.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.nav_graph_classwork.Constants
import com.example.nav_graph_classwork.adapters.GridAdapter
import com.example.nav_graph_classwork.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)

        binding.recyclerSecond.layoutManager = GridLayoutManager(requireActivity(), 2)
        binding.recyclerSecond.adapter = GridAdapter(Constants.array, requireActivity())

        return binding.root
    }
}