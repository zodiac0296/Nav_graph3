package com.example.nav_graph_classwork.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.nav_graph_classwork.Constants
import com.example.nav_graph_classwork.R
import com.example.nav_graph_classwork.adapters.GridAdapter
import com.example.nav_graph_classwork.adapters.LinearAdapter
import com.example.nav_graph_classwork.databinding.FragmentFirstBinding
import com.example.nav_graph_classwork.databinding.FragmentLoginBinding


class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.recyclerFirst.adapter = GridAdapter(Constants.array, requireActivity())

        return binding.root
    }

}