package com.moklet.bismillahandroiot.data.remote

import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @GET("feeds.json")
    fun geetAllFeeds(): Call<FeedsResponse>
}