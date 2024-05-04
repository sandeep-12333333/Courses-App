package com.example.androidproject

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity



class MainClassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_class)
        val des = findViewById<ImageView>(R.id.designing1)
        val cl = findViewById<ImageView>(R.id.cloud1)
        val art = findViewById<ImageView>(R.id.ai)
        val and = findViewById<ImageView>(R.id.designing)
        val webd = findViewById<ImageView>(R.id.webdevelop)
        val cld = findViewById<ImageView>(R.id.webdevelop1)
        val and1 = findViewById<ImageView>(R.id.android1a)
        val art1 = findViewById<ImageView>(R.id.ai1)
        val cldd = findViewById<ImageView>(R.id.cloud1a)
        val desi = findViewById<ImageView>(R.id.designing1a)
        val andr = findViewById<ImageView>(R.id.android1)
        val not = findViewById<ImageView>(R.id.develop)
        val extern = findViewById<ImageView>(R.id.develop)
        extern.setOnClickListener {
            val intent = Intent(this@MainClassActivity, InternalStorage::class.java)
            startActivity(intent)
        }
        not.setOnClickListener {
            val intent = Intent(this@MainClassActivity, NavigationActivity::class.java)
            startActivity(intent)
        }
        and1.setOnClickListener{
            val intent = Intent(this@MainClassActivity, AllClassActivity::class.java)
            startActivity(intent)
        }
        art1.setOnClickListener{
            val intent = Intent(this@MainClassActivity, CloudActivity::class.java)
            startActivity(intent)
        }
        cldd.setOnClickListener{
            val intent = Intent(this@MainClassActivity, AllClassActivity::class.java)
            startActivity(intent)
        }
        desi.setOnClickListener{
            val intent = Intent(this@MainClassActivity, CodingActivity::class.java)
            startActivity(intent)
        }
        andr.setOnClickListener{
            val intent = Intent(this@MainClassActivity, AllClassActivity::class.java)
            startActivity(intent)
        }

        cld.setOnClickListener{
            val intent = Intent(this@MainClassActivity, CloudActivity::class.java)
            startActivity(intent)
        }
        webd.setOnClickListener {
            val intent = Intent(this@MainClassActivity,CodingActivity::class.java)
            startActivity(intent)
        }
        des.setOnClickListener {
            val intent = Intent(this@MainClassActivity, CodingActivity::class.java)
            startActivity(intent)
        }
        cl.setOnClickListener {
            val intent = Intent(this@MainClassActivity, CodingActivity::class.java)
            startActivity(intent)
        }
        art.setOnClickListener {
            val intent = Intent(this@MainClassActivity, AllClassActivity::class.java)
            startActivity(intent)

        }
    }
}