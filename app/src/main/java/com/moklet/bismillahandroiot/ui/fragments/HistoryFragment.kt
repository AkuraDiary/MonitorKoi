package com.moklet.bismillahandroiot.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.moklet.bismillahandroiot.databinding.HistoryLayoutBinding
import com.moklet.bismillahandroiot.databinding.MainFragmentBinding

class HistoryFragment : Fragment(){
    private var binding : HistoryLayoutBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = HistoryLayoutBinding.inflate(inflater, container, false)
        return binding!!.root
    }
}