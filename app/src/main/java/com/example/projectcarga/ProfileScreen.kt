package com.example.projectcarga

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile_screen)

        val btnHomeScreen : LinearLayout = findViewById(R.id.homeRedirect)
        val btnMainScreen : Button = findViewById(R.id.signOffButton)

        btnHomeScreen.setOnClickListener() {
            val i = Intent(this, HomePage::class.java)
            startActivity(i)
        }

        btnMainScreen.setOnClickListener() {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }
}