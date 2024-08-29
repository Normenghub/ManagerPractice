package com.example.managerpracticeapp.ui.reservation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.managerpracticeapp.databinding.ActivityReservationStep1Binding

class ReservationStep1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityReservationStep1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReservationStep1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        navigateToMain()
    }

    private fun navigateToMain() {
        binding.backBtn.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        binding.previousBtn.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }

}