package com.example.projectcarga

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)

        val btnProfileScreen : LinearLayout = findViewById(R.id.profileRedirect)
        val btnPlannerScreen : LinearLayout = findViewById(R.id.plannerRedirect)

        btnProfileScreen.setOnClickListener() {
            val i = Intent(this, ProfileScreen::class.java)
            startActivity(i)
        }
    }
}