package com.moklet.bismillahandroiot.data

import com.moklet.bismillahandroiot.data.model.DataModel

object DummyData {
    fun generateDummyData() : List<DataModel>{
        val dummyDatas : MutableList<DataModel> = arrayListOf()
        for(i in 1..70){
            dummyDatas.add(
                DataModel(
                    "Monday",
                    "6 Juni 2022",
                    23.0 / i + i,
                    23.0 / i + i,
                    23.0 / i + i,
                    23.0 / i + i
                )
            )
        }
        return dummyDatas
    }

}