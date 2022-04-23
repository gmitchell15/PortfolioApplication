package com.example.afinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.afinal.databinding.ActivityBagwellSiteBinding
import com.example.afinal.databinding.ActivityMainBinding

class BagwellSite : AppCompatActivity() {
    private lateinit var binding: ActivityBagwellSiteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBagwellSiteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}