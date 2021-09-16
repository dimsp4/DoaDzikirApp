package com.example.tugas_3

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.activity_home, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.bahasa -> {
                Toast.makeText(, this, "Pengaturan Bahasa", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.tampilan -> {
                Toast.makeText(, this, "Pengaturan Tampilan", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.logout -> {
                startActivity(Intent(this, LoginActivity::class.java))
                return true
            }
        }
    }
}