package com.prokhach.composition.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prokhach.composition.R
import com.prokhach.composition.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
    }
}