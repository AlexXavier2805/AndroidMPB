package com.example.proyectompdb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLog = findViewById<Button>(R.id.btnLog)
        btnLog.setOnClickListener { startActivity(Intent(this@MainActivity,MenuActivity::class.java)) }
    }
}