package com.ijeoma.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.ijeoma.todoapp.databinding.ActivityProfileBinding
import javax.net.ssl.SSLSessionBindingEvent


class ProfileActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityProfileBinding

    private lateinit var Homebutton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        Homebutton = findViewById (R. id.Homebutton)
        Homebutton.setOnClickListener {
            val anyIntent = Intent(this, Homebutton:: class.java)
            startActivity(anyIntent)
        }
    }
}