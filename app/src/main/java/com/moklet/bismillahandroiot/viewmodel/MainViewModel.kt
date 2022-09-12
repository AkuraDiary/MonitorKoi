package com.moklet.bismillahandroiot.viewmodel

import androidx.lifecycle.ViewModel
import com.moklet.bismillahandroiot.repository.FeedsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(repository: FeedsRepository) : ViewModel(){

    val feeds = repository.getFeeds()//feedsList
}