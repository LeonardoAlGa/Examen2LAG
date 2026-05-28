package com.example.examen2lag

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvUsernameValue = findViewById<TextView>(R.id.tvUsernameValue)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        val username = intent.getStringExtra("EXTRA_USERNAME") ?: "Invitado"
        tvUsernameValue.text = username

        btnLogout.setOnClickListener {
            finish()
        }
    }
}