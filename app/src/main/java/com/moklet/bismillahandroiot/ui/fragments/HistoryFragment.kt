package com.moklet.bismillahandroiot.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL
import com.moklet.bismillahandroiot.adapter.HistoryAdapter
import com.moklet.bismillahandroiot.data.DummyData
import com.moklet.bismillahandroiot.data.model.DataModel
import com.moklet.bismillahandroiot.databinding.HistoryLayoutBinding
import com.moklet.bismillahandroiot.databinding.MainFragmentBinding

class HistoryFragment : Fragment(){
    private var binding : HistoryLayoutBinding? = null
    private lateinit var historyAdapter : HistoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = HistoryLayoutBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        historyAdapter = HistoryAdapter()
        val mLayoutManager = LinearLayoutManager(requireContext())
        mLayoutManager.orientation = HORIZONTAL
        
        binding?.rvHistory?.apply {
            layoutManager = mLayoutManager
            setHasFixedSize(true)
            adapter = historyAdapter
        }
        val dummyData = DummyData.generateDummyData()
        historyAdapter.setData(dummyData as ArrayList<DataModel>)
    }
}