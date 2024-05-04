package com.example.androidproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class AllClassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_all_class)
        val f1 = findViewById<YouTubePlayerView>(R.id.youtube1s)
        lifecycle.addObserver(f1)
        val f2 = findViewById<YouTubePlayerView>(R.id.youtube21s)
        lifecycle.addObserver(f2)
        val f3 = findViewById<YouTubePlayerView>(R.id.youtube21d)
        lifecycle.addObserver(f3)
        val f4 = findViewById<YouTubePlayerView>(R.id.youtube21u)
        lifecycle.addObserver(f4)
    }
}