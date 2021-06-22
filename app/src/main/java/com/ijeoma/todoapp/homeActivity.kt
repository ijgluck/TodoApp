package com.ijeoma.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class homeActivity : AppCompatActivity() {
    private lateinit var usernameDisplay: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usernameDisplay = findViewById(R.id.usernameDisplay)

        usernameDisplay.text = intent.getStringExtra("username")

    }
}