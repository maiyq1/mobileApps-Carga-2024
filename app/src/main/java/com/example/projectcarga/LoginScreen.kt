package com.example.projectcarga

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_screen)

        val btnLoginButton : Button = findViewById(R.id.loginButtonNew)
        val btnSignupRedirect : TextView = findViewById(R.id.signupRedirect)
        btnSignupRedirect.setOnClickListener() {
            val i = Intent(this, SignupScreen::class.java)
            startActivity(i)
        }

        btnLoginButton.setOnClickListener() {
            val i = Intent(this, HomePage::class.java)
            startActivity(i)
        }
    }
}