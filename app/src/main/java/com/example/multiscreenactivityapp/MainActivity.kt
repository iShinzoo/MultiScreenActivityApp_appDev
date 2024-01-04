package com.example.multiscreenactivityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        val firstName = findViewById<EditText>(R.id.edt_first_name)
        val lastName  = findViewById<EditText>(R.id.edt_last_name)


        btn.setOnClickListener(){
            // using Intent
            val edtFirstName = firstName.text.toString()
            val edtLastName = lastName.text.toString()
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("edt_first_name",edtFirstName)
            intent.putExtra("edt_last_name",edtLastName)
            startActivity(intent)
        }
    }
}