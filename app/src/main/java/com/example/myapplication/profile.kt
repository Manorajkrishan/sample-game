package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        var btnNext4 = findViewById<ImageView>(R.id.mes)
        btnNext4.setOnClickListener {
            val intent = Intent(this, Massages::class.java)
            startActivity(intent)
            finish()
        }
        var btnNext = findViewById<ImageView>(R.id.homeie)
        btnNext.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }
        var btnNext2 = findViewById<ImageView>(R.id.match)
        btnNext2.setOnClickListener {
            val intent = Intent(this, Matching::class.java)
            startActivity(intent)
            finish()
        }
        var btnNext5 = findViewById<Button>(R.id.del)
        btnNext5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        var btnNext6 = findViewById<Button>(R.id.logoutb)
        btnNext6.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}