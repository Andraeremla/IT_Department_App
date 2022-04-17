package com.example.itdepartmentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Admission : AppCompatActivity() {
    private val url: String = "https://ucc.edu.jm/apply/undergraduate"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admission)

        val text: TextView = findViewById(R.id.pragraphOne)
        val texttwo: TextView = findViewById(R.id.tv2)
        val textthree: TextView = findViewById(R.id.tv3)

        //Launches device browser and loads specified URL
        val apply: Button = findViewById(R.id.applybtn)
        apply.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }




    }
}