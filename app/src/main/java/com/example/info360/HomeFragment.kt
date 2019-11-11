package com.example.info360


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.info360.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false)
        val binding : FragmentHomeBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,
            container,false)

        binding.depressionButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.
            id.action_homeFragment_to_secondScreenFragment))
        binding.stressButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.
            id.action_homeFragment_to_secondScreenFragment))
        binding.anxietyButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.
            id.action_homeFragment_to_secondScreenFragment))
        binding.selfEsteemButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.
            id.action_homeFragment_to_secondScreenFragment))
        binding.moreButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.
            id.action_homeFragment_to_secondScreenFragment))

        return binding.root
    }


}
