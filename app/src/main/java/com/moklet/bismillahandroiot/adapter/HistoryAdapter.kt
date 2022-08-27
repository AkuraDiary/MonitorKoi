package com.moklet.bismillahandroiot.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

import com.moklet.bismillahandroiot.data.model.DataModel
import com.moklet.bismillahandroiot.databinding.HistoryItemLayoutBinding
import com.moklet.bismillahandroiot.databinding.HistoryLayoutBinding

class HistoryAdapter : RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>(){

    val listItem = ArrayList<DataModel>()

    inner class HistoryViewHolder(private val binding : HistoryItemLayoutBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(dataModel: DataModel) {
            binding.apply {
                tvDate.text = dataModel.date
                tvDay.text = dataModel.day

                tvAcidityData.text = dataModel.water_acidity_data.toString()
                tvTempData.text = dataModel.temp_data.toString()
                tvTurbidityData.text = dataModel.turbidity_data.toString()
                tvDissolvedOxyData.text = dataModel.dissolved_oxy_data.toString()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        val view = HistoryItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HistoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.bind(listItem[position])
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    fun setData(data : ArrayList<DataModel>){
        val diffCallback = HistoryCallback(listItem, data)
        val diffResutl = DiffUtil.calculateDiff(diffCallback)
        listItem.clear()
        listItem.addAll(data)
        diffResutl.dispatchUpdatesTo(this)
    }

//    companion object{
//        val HistoryCallback = object : DiffUtil.ItemCallback<DataModel>() {
//            override fun areItemsTheSame(oldItem: DataModel, newItem: DataModel): Boolean {
//                return oldItem == newItem
//            }
//
//            override fun areContentsTheSame(oldItem: DataModel, newItem: DataModel): Boolean {
//                return oldItem.date == newItem.date
//            }
//
//        }
//    }
}