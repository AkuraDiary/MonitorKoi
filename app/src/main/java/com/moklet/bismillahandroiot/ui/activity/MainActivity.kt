package com.moklet.bismillahandroiot.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.moklet.bismillahandroiot.R
import com.moklet.bismillahandroiot.databinding.ActivityMainBinding
import com.moklet.bismillahandroiot.ui.fragments.HistoryFragment
import com.moklet.bismillahandroiot.ui.fragments.MainFragment

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
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
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}