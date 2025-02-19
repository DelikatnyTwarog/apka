package com.example.apka

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.apka.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var _binding:FragmentSecondBinding? = null
    private val binding get() = _binding!!
    private val dupa = 2137

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.secondButton.setOnClickListener {
            Toast.makeText(requireContext(), "Click - Second fragment", Toast.LENGTH_SHORT)
                .show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

        //DUPA DUPA DUPA DUPA CHUJ

    }

}