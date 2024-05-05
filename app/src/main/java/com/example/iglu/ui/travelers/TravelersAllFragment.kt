package com.example.iglu.ui.travelers

import android.R.attr.fragment
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.iglu.R
import com.example.iglu.databinding.FragmentAllTravelersBinding


class TravelersAllFragment : Fragment() {

    private var _binding: FragmentAllTravelersBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val travelersViewModel =
            ViewModelProvider(this)[TravelersAllViewModel::class.java]

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}