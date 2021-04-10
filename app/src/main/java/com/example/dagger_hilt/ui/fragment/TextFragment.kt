package com.example.dagger_hilt.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import com.example.dagger_hilt.R
import com.example.dagger_hilt.databinding.FragmentTextBinding

class TextFragment : Fragment(R.layout.fragment_text) {

   private lateinit var binding: FragmentTextBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentTextBinding.bind(view)
    }


}