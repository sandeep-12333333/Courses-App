package com.example.androidproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Getstarted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_getstarted)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent1= Intent(this, MainClassActivity::class.java)
            startActivity(intent1)
        }


    }
}