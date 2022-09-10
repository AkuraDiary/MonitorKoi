package com.moklet.bismillahandroiot.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.moklet.bismillahandroiot.data.DummyData
import com.moklet.bismillahandroiot.databinding.MainFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {
    private var binding : MainFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var list = DummyData.generateDummyData()
        var todayData = list[0]
        binding?.apply {
            tvDateToday.text = todayData.date

            tvDissolvedOxyData.text = todayData.dissolved_oxy_data.toString()
            tvTempData.text = todayData.temp_data.toString()
            tvWaterAcidData.text = todayData.water_acidity_data.toString()
            tvTurbidityData.text = todayData.turbidity_data.toString()
        }

    }

    override fun onDetach() {
        super.onDetach()
        binding = null
    }
}