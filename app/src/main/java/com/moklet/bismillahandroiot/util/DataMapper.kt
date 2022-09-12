package com.moklet.bismillahandroiot.util

import com.moklet.bismillahandroiot.data.model.DataModel
import com.moklet.bismillahandroiot.data.remote.FeedModel

object DataMapper {
    fun mapFeedModelsIntoDataModels(feedModels: List<FeedModel>): List<DataModel> {
        return feedModels.map {
            DataModel(
                it.created_at.substring(0, 10),
                it.field2?.toDouble(),
                it.field3?.toDouble(),
                it.field4?.toDouble(),
                it.field5?.toDouble(),
            )
        }
    }
}