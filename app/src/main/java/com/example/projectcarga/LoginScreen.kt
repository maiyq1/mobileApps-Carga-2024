package com.example.projectcarga

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_screen)

        val btnSignupRedirect : TextView = findViewById(R.id.signupRedirect)

        btnSignupRedirect.setOnClickListener() {
            val i = Intent(this, SignupScreen::class.java)
            startActivity(i)
        }
    }
}