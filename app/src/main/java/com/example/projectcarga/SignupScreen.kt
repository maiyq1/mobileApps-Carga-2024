package com.example.projectcarga

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignupScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup_screen)

        val btnLoginRedirect : TextView = findViewById(R.id.loginRedirect)

        btnLoginRedirect.setOnClickListener() {
            val i = Intent(this, LoginScreen::class.java)
            startActivity(i)
        }
    }
}