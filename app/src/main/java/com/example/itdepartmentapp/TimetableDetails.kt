package com.example.itdepartmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class TimetableDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timetable_details)

        //Gets value sent from Directory activity
        val index: String? = this.intent.getStringExtra("listIndex")

        //Creates objects for each activity element
        val name: TextView = findViewById(R.id.name)
        val Day: TextView = findViewById(R.id.Day)
        val Time: TextView = findViewById(R.id.time)
        val Lecturer: TextView = findViewById(R.id.lecturer)
        val ID: TextView = findViewById(R.id.id)

        //Assigns value to elements according to retrieved index
        when(index){
            "0" -> {
                ID.text = "ITT101"
                name.text = "Computer Information Systems"
                Day.text = "Saturday."
                Time.text = "6:00pm - 9:00pm"
                Lecturer.text = "Winsome Bennett"
            }
            "1" -> {
                ID.text = "ITT102"
                name.text = "Discrete Mathematics 1"
                Day.text = "Monday"
                Time.text = "12:00pm - 2:00pm"
                Lecturer.text = "Otis Osbourne"
            }
            "2" -> {
                ID.text = "ITT103"
                name.text = "Programming Techniques"
                Day.text = "Tuesday"
                Time.text = "6:00pm - 8:00pm"
                Lecturer.text = "Otis Osbourne"
            }
            "3" -> {
                ID.text = "ITT101"
                name.text = "Computer Essentails and Troubleshooting"
                Day.text = "Sa."
                Time.text = "8:00pm - 10:00pm"
                Lecturer.text = "Matthew Kendley"
            }
            "4" -> {
                ID.text = "ITT104"
                name.text = "Database Management Systems "
                Day.text = "Tuesday"
                Time.text = "8:00pm - 10:00pm"
                Lecturer.text = "Garfield Sahadeo"
            }
            "5" -> {
                ID.text = "ITT200"
                name.text = "Object Oriented Programming Using C++ "
                Day.text = "Thursday"
                Time.text = "12:00pm - 2:00pm"
                Lecturer.text = "Rochelle McBean"
            }
            "6" -> {
                ID.text = "ITT201"
                name.text = "Data Communications & Networks"
                Day.text = "Tuesday"
                Time.text = "8:00pm - 10:00pm"
                Lecturer.text = "Garfield Sahadeo"
            }
            "7" -> {
                ID.text = "ITT104"
                name.text = "Database Management Systems "
                Day.text = "Tuesday"
                Time.text = "8:00pm - 10:00pm"
                Lecturer.text = "Garfield Sahadeo"
            }
            "8" -> {
                ID.text = "ITT104"
                name.text = "Database Management Systems "
                Day.text = "Tuesday"
                Time.text = "8:00pm - 10:00pm"
                Lecturer.text = "Garfield Sahadeo"
            }
            "9" -> {
                ID.text = "ITT104"
                name.text = "Database Management Systems "
                Day.text = "Tuesday"
                Time.text = "8:00pm - 10:00pm"
                Lecturer.text = "Garfield Sahadeo"
            }
        }
    }
}