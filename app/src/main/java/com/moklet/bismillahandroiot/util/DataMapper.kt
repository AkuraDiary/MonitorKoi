package com.moklet.bismillahandroiot.util

import com.moklet.bismillahandroiot.data.model.DataModel
import com.moklet.bismillahandroiot.data.remote.FeedModel

object DataMapper {
    fun mapFeedModelsIntoDataModels(feedModels: List<FeedModel>): List<DataModel> {
        return feedModels.map {
            DataModel(
                it.created_at,
                it.field2 as Double?,
                it.field3 as Double?,
                it.field4 as Double?,
                it.field5 as Double?,
            )
        }
    }
}