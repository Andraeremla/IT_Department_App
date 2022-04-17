package com.example.itdepartmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class StaffDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staff_details)

        //Gets value sent from Directory activity
        val index: String? = this.intent.getStringExtra("listIndex")

        //Creates objects for each activity element
        val name: TextView = findViewById(R.id.Stname)
        val email: TextView = findViewById(R.id.Stemail)
        val photo: ImageView = findViewById(R.id.StPhoto)
        val hod: TextView = findViewById(R.id.StTitle)
        val number: TextView = findViewById(R.id.Stphonenumber)

        //Assigns value to elements according to retrieved index
        when(index){
            "0" -> {
                name.text = "ROSE, Natalie"
                email.text = "ithod@ucc.edu.jm"
                photo.setImageResource(R.drawable.rose)
                number.text = "876-339-0961"
                hod.text = "Information Technology HOD"
            }
            "1" -> {
                name.text = "DAVIDSON, Sonia"
                email.text = "businessadminhod@ucc.edu.jm"
                photo.setImageResource(R.drawable.davidson)
                number.text = "876-315-6879"
                hod.text = "Business Administration HOD"
            }
            "2" -> {
                name.text = "AMONDE, Tom"
                email.text = "graduatestudiesdirector@ucc.edu.jm"
                photo.setImageResource(R.drawable.amonde)
                number.text = "876-906-3000"
                hod.text = "Senior Director"
            }
            "3" -> {
                name.text = "MILLER, Ionie"
                email.text = "appliedpsychologyfaculty@ucc.edu.jm"
                photo.setImageResource(R.drawable.miller)
                number.text = "876-906-3000"
                hod.text = "General Studies and Behavioural Sciences HOD"
            }
            "4" -> {
                name.text = "NDAJAH, Peter"
                email.text = "headofschoolsmathit@ucc.edu.jm"
                photo.setImageResource(R.drawable.ndajah)
                number.text = "876-906-3000"
                hod.text = "Mathematics HOD"
            }
        }





    }
}