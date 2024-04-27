package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnNext = findViewById<Button>(R.id.b1)
        btnNext.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }


        }
    }
