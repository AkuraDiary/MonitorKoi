package com.moklet.bismillahandroiot.util

import com.moklet.bismillahandroiot.data.model.DataModel
import com.moklet.bismillahandroiot.data.remote.FeedModel
import java.time.LocalDate
import java.time.format.DateTimeFormatter

object DataMapper {
    private fun getDay(date: String):String{
        val mDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-M-dd"))
        return mDate.dayOfWeek.toString()
    }
    fun mapFeedModelsIntoDataModels(feedModels: List<FeedModel>): List<DataModel> {
        return feedModels.map {
            DataModel(
                getDay(it.created_at.substring(0, 10)),
                it.created_at.substring(0, 10),
                it.field2?.toDouble(),
                it.field3?.toDouble(),
                it.field4?.toDouble(),
                it.field5?.toDouble(),
            )
        }
    }
}