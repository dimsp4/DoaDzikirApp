package com.example.tugas_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {

    private lateinit var dataEmail: Array<String>
    private lateinit var dataPassword: Array<String>
    private lateinit var progressBar: ProgressBar?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val edtEmail: EditText = findViewById(R.id.email)
        val edtPassword: EditText = findViewById(R.id.password)
        val btnLogin: Button = findViewById(R.id.btn_login)
        val btnRegister: Button = findViewById(R.id.btn_register)
        progressBar = findViewById(R.id.progressBar)
        val btnForgetPass: TextView = findViewById(R.id.forget_password)
        val radioRemember: RadioButton = findViewById(R.id.rememberme)

        dataEmail = arrayOf("dimas", "pamungkas", "setiabudi")
        dataPassword = arrayOf("1234", "5678", "9101")

        btnLogin.setOnClickListener {
            signIn(edtEmail.text.toString(), edtPassword.text.toString())
        }

    }

    fun signIn (email: String, password: String){
        for(i in dataEmail.indices){
            val takeDataEmail = dataEmail.get(i)
            val takeDataPass = dataPassword.get(i)
            if (takeDataEmail == email || takeDataPass == password){
                // Toast.makeText(this, "LogedIn", Toast.LENGTH_SHORT).show()
                progressBar?.visibility = View.GONE
                startActivity(Intent(this, HomeActivity::class.java))
                break
            }else{
                progressBar?.visibility = View.GONE
                Toast.makeText(this, "Akun Salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}