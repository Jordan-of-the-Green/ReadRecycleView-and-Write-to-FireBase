package com.administrator.firebase_write

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btMainpage = findViewById<Button>(R.id.btn_send)
        btMainpage.setOnClickListener()
        {
            val intent = Intent(this, TimesheetActivity::class.java)
            startActivity(intent)
        }
    }
}