package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var btn = findViewById<Button>(R.id.button14)
        btn.setOnClickListener {
            val intent = Intent(this, Systemlog::class.java)
            startActivity(intent)
            finish()
        }
        var btnNext = findViewById<Button>(R.id.b2)
        btnNext.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
            finish()
        }

    }
}