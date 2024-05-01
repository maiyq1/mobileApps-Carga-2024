package com.example.projectcarga

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnMenuScreen : Button = findViewById(R.id.btnMenuScreen)

        btnMenuScreen.setOnClickListener() {
            val i = Intent(this, LoginScreen::class.java)
            startActivity(i)
        }
    }
}