package com.example.info360


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
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

        binding.depCardview.setBackgroundResource(R.drawable.depression_box)
        binding.stressCardView.setBackgroundResource(R.drawable.stress_box)
        binding.anxietyCardView.setBackgroundResource(R.drawable.anxiety_box)
        binding.selfEsteemCardView.setBackgroundResource(R.drawable.self_esteem_box)
        binding.moreCardView.setBackgroundResource(R.drawable.more_box)




        return binding.root
    }


}
