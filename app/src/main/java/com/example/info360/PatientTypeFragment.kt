package com.example.info360


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.info360.databinding.FragmentPatientTypeBinding

/**
 * A simple [Fragment] subclass.
 */
class PatientTypeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentPatientTypeBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_patient_type,container,false)

        binding.teenageButton.setBackgroundResource(R.drawable.self_esteem_box)
        binding.coupleButton.setBackgroundResource(R.drawable.anxiety_box)
        binding.individualButton.setBackgroundResource(R.drawable.more_box)





        return binding.root
    }


}
