package com.example.doadzikirapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DzikirPagiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_dzikir_pagi)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}