package com.example.intent

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page2)

        val textDisplay = findViewById<TextView>(R.id.textDisplay)

        // Ambil Intent dari activity sebelumnya
        val intent = intent

        // meriksa apakah Intent memiliki data
        if (intent.hasExtra("EXTRA_MESSAGE")) {
            // Dapatkan data dari Intent
            val message = intent.getStringExtra("EXTRA_MESSAGE")

            // Tampilkan data yang diterima
            textDisplay.text = message
        }

    }
}