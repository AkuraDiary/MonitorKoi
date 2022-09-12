package com.moklet.bismillahandroiot.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL
import com.moklet.bismillahandroiot.adapter.HistoryAdapter
import com.moklet.bismillahandroiot.databinding.HistoryLayoutBinding
import com.moklet.bismillahandroiot.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mLayoutManager = LinearLayoutManager(requireContext())
        mLayoutManager.orientation = HORIZONTAL
        //historyAdapter = HistoryAdapter()
//        viewModel.feeds.observe(viewLifecycleOwner) {
//            historyAdapter.setData(it as ArrayList<DataModel>)
//        }
        binding?.rvHistory?.apply {
            layoutManager = mLayoutManager
            setHasFixedSize(true)
            adapter = historyAdapter
        }

//        val dummyData = DummyData.generateDummyData()
//        historyAdapter.setData(dummyData as ArrayList<DataModel>)
    }

    companion object{
        val historyAdapter = HistoryAdapter()
    }
}