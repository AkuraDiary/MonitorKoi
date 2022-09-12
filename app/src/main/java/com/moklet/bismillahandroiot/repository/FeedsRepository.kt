package com.moklet.bismillahandroiot.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.moklet.bismillahandroiot.data.model.DataModel
import com.moklet.bismillahandroiot.data.remote.ApiService
import com.moklet.bismillahandroiot.data.remote.FeedsResponse
import com.moklet.bismillahandroiot.util.DataMapper
import javax.inject.Inject

class FeedsRepository @Inject constructor(private val service: ApiService) {
    private val _feedsList = MutableLiveData<List<DataModel>>()
    val feedsList: LiveData<List<DataModel>> = _feedsList

    fun getFeeds() : LiveData<List<DataModel>> {
        service.geetAllFeeds()
            .enqueue(object : retrofit2.Callback<FeedsResponse> {
                override fun onResponse(
                    call: retrofit2.Call<FeedsResponse>,
                    response: retrofit2.Response<FeedsResponse>
                ) {
                    if (response.isSuccessful) {
                        _feedsList.postValue(response.body()?.feeds?.let {
                            DataMapper.mapFeedModelsIntoDataModels(
                                it
                            )
                        })

                    }
                }

                override fun onFailure(call: retrofit2.Call<FeedsResponse>, t: Throwable) {
                    t.printStackTrace()
                }
            })
        return feedsList
    }


}