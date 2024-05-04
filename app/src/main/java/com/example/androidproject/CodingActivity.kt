package com.example.androidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class CodingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coding)
        val you = findViewById<YouTubePlayerView>(R.id.youtube)
        lifecycle.addObserver(you)
        val you2 = findViewById<YouTubePlayerView>(R.id.youtube2)
        lifecycle.addObserver(you2)
    }
}