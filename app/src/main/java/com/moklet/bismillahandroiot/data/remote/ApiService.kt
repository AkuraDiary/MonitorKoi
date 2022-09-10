package com.moklet.bismillahandroiot.data.remote

import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @GET("feeeds.json")
    fun geetAllFeeds(): Call<FeedsResponse>
}