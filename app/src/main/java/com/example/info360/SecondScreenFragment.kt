package com.example.info360


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.info360.databinding.FragmentSecondScreenBinding

/**
 * A simple [Fragment] subclass.
 */
class SecondScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_second_screen, container, false)
        val binding: FragmentSecondScreenBinding = DataBindingUtil.inflate(inflater,R.layout.
            fragment_second_screen,container,false)


        return binding.root
    }


}
