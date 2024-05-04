package com.example.androidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class CloudActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cloud)
        val youtubee = findViewById<YouTubePlayerView>(R.id.youtube1)
        lifecycle.addObserver(youtubee)

        val youtu = findViewById<YouTubePlayerView>(R.id.youtube21)
        lifecycle.addObserver(youtu)

    }
}