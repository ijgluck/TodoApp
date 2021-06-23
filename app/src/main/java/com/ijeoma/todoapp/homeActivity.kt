package com.ijeoma.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class homeActivity : AppCompatActivity() {
    private lateinit var usernameDisplay: TextView
    private lateinit var ProfileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usernameDisplay = findViewById(R.id.usernameDisplay)

        usernameDisplay.text = intent.getStringExtra("username")

        ProfileButton.setOnClickListener {
            openProfilepage()
        }

    }
    private fun openProfilepage(){
        val intent: Intent = Intent (this, ProfileButton::class.java)
        startActivity(intent)
    }
}