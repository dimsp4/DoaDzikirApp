package com.example.doadzikirapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HarianDzikirDoaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_harian_dzikir_doa)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}