package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var btnNext = findViewById<ImageView>(R.id.p1)
        btnNext.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
            finish()

        }
        var btnNext1 = findViewById<ImageView>(R.id.mes)
        btnNext1.setOnClickListener {
            val intent = Intent(this, Massages::class.java)
            startActivity(intent)
            finish()

        }
        var btnNext4 = findViewById<ImageView>(R.id.match)
        btnNext4.setOnClickListener {
            val intent = Intent(this, Matching::class.java)
            startActivity(intent)
            finish()
        }
    }
}