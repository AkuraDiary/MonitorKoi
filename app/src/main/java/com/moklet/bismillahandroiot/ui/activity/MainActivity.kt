package com.moklet.bismillahandroiot.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.moklet.bismillahandroiot.R
import com.moklet.bismillahandroiot.data.model.DataModel
import com.moklet.bismillahandroiot.databinding.ActivityMainBinding
import com.moklet.bismillahandroiot.ui.fragments.HistoryFragment
import com.moklet.bismillahandroiot.ui.fragments.MainFragment
import com.moklet.bismillahandroiot.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        initFragments()
    }

    private fun initFragments() {

        supportFragmentManager
            .beginTransaction()
            .add(R.id.mainViewFragmentContainer, MainFragment())
            .add(R.id.historyViewFragmentContainer, HistoryFragment())
            .commit()

        viewModel.feeds.observe(this) {
            HistoryFragment.historyAdapter.setData(it as ArrayList<DataModel>)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}