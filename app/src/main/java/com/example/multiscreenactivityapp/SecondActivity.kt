package com.example.multiscreenactivityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val firstName =  intent.getStringExtra("edt_first_name")
        val LastName = intent.getStringExtra("edt_last_name")
        val txt = findViewById<TextView>(R.id.txt)
        txt.text = "Hello , $firstName $LastName"

    }
}