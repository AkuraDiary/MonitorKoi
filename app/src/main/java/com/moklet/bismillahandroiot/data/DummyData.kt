package com.moklet.bismillahandroiot.data

import com.moklet.bismillahandroiot.data.model.DataModel

object DummyData {
    fun generateDummyData() : List<DataModel>{
        val dummyDatas : MutableList<DataModel> = arrayListOf()
        dummyDatas.add(
                DataModel(
                    "Friday",
                    "9 September 2022",
                    25.0,
                    8.43,
                    50.0,
                    16.0
                )
            )
        dummyDatas.add(
            DataModel(
                "Thursday",
                "8 September 2022",
                25.0,
                8.57,
                50.0,
                16.0
            )
        )
//        for(i in 1..70){
//            dummyDatas.add(
//                DataModel(
//                    "Monday",
//                    "6 Juni 2022",
//                    23.0 / i + i,
//                    23.0 / i + i,
//                    23.0 / i + i,
//                    23.0 / i + i
//                )
//            )
//        }
        return dummyDatas
    }

}