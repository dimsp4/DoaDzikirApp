package com.example.doadzikirapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class PagiPetangDzikirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_pagi_petang_dzikir)

        val cvDzikirPagi = findViewById<CardView>(R.id.cv_dzikir_pagi)
        cvDzikirPagi.setOnClickListener {
            startActivity(Intent(this, DzikirPagiActivity::class.java))
        }
        val cvDzikirPetang = findViewById<CardView>(R.id.cv_dzikir_petang)
        cvDzikirPetang.setOnClickListener {
            startActivity(Intent(this, DzikirPetangActivity::class.java))
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}