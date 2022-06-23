package com.example.newnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class sixFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_six, container, false)
        val btnSeven : Button = view.findViewById(R.id.btnSeven)
        btnSeven.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_sixFragment_to_oneFragment)
        }
        return view
    }
}