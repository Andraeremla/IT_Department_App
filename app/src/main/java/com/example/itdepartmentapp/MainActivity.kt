package com.example.itdepartmentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private val mail: String = "ithod@ucc.edu.jm"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Method launches Social/Facebook activity
        val web: ImageButton = findViewById(R.id.ibFB)
        web.setOnClickListener {
            val intent = Intent(this, SocialFB::class.java)
            startActivity(intent)
        }
        //Method launches Social/IG activity
        val webIG: ImageButton = findViewById(R.id.ibIG)
        webIG.setOnClickListener {
            val intent = Intent(this, SocialIG::class.java)
            startActivity(intent)
        }

        //Method launches Social/Twitter activity
        val webTwitter: ImageButton = findViewById(R.id.ibTwitter)
        webTwitter.setOnClickListener {
            val intent = Intent(this, SocialTwitter::class.java)
            startActivity(intent)
        }

        //Opens the admission activity

        val btnAd: Button = findViewById(R.id.btnAdmission)
        btnAd.setOnClickListener{
            val intent = Intent(this, Admission::class.java)
            startActivity(intent)
        }

        //Opens the staff directory activity

        val btnStaff: Button = findViewById(R.id.btnStaff)
        btnStaff.setOnClickListener{
            val intent = Intent(this, Directory::class.java)
            startActivity(intent)
        }




        //Sends email to preset address when FAB is clicked
        val sendEmail: FloatingActionButton = findViewById(R.id.fabEmail)
        sendEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", mail, null))
            intent.putExtra(Intent.EXTRA_EMAIL, mail)
            startActivity(intent)
        }
    }
}