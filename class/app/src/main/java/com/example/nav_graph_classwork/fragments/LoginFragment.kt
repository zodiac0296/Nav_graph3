package com.example.nav_graph_classwork.fragments
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nav_graph_classwork.HomeActivity
import com.example.nav_graph_classwork.databinding.FragmentLoginBinding
import com.example.nav_graph_classwork.servies.SharedPreference

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val sharedPref = context?.let { SharedPreference(it) }
        if(!sharedPref?.login.isNullOrBlank() && !sharedPref?.password.isNullOrBlank()){
            startActivity(Intent(requireActivity(), HomeActivity::class.java))
        }

        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.submit.setOnClickListener {
            sharedPref?.login = binding.loginEdit.text.toString()
            sharedPref?.password = binding.passwordEdit.text.toString()
            startActivity(Intent(requireActivity(), HomeActivity::class.java))
        }


        return binding.root
    }

}
