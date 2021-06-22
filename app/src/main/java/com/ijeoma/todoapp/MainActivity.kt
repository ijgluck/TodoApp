package com.ijeoma.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.LoginFilter
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    val validuserName: String = "admin"
    val validpassword: String = "admin"
    private lateinit var userNameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var submitButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userNameInput = findViewById(R. id. Username_Input)
        passwordInput = findViewById(R. id. password_Input)
        submitButton = findViewById(R. id. submit_Button)


        submitButton.setOnClickListener {
            val userName = userNameInput.text.toString()
            val password = passwordInput.text.toString()
            login(userName,password)
        }



    }

    fun login (userName: String, password: String){
        if ( isValidCredentials(userName, password)){
            val intent: Intent = Intent(this, homeActivity :: class.java)
            intent.putExtra("username", userName)
            startActivity(intent)
            }
            else{
                Toast.makeText(applicationContext, "Incorrect Credentials", Toast.LENGTH_SHORT).show()
        }

    }
private  fun  isValidCredentials (userName: String, password: String): Boolean{
    if  (userName == validuserName && password == validpassword) return true
    return false
}
}
