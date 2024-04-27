package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Matching : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matching)
        var btnNext = findViewById<ImageView>(R.id.match)
        btnNext.setOnClickListener {
            val intent = Intent(this, Matching::class.java)
            startActivity(intent)
            finish()
        }
        var btnNext1 = findViewById<ImageView>(R.id.p1)
        btnNext1.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
            finish()
        }
        var btnNext3 = findViewById<ImageView>(R.id.homeie)
        btnNext3.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }
        var btnNext4 = findViewById<ImageView>(R.id.mes)
        btnNext4.setOnClickListener {
            val intent = Intent(this, Massages::class.java)
            startActivity(intent)
            finish()
        }
    }
}