package com.rui.paulo.calei.databindingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.rui.paulo.calei.databindingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btn.setOnClickListener {
            displayName()
        }
    }

    private fun displayName() {
        binding.apply {
           textTv.text = edTv.text.trim()
        }
    }
}