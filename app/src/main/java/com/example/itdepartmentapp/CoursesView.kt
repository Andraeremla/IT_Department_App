package com.example.itdepartmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class CoursesView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses_view)

        //Gets value sent from Directory activity
        val index: String? = this.intent.getStringExtra("listIndex")

        //Creates objects for each activity element
        val name: TextView = findViewById(R.id.course_name)
        val code: TextView = findViewById(R.id.tvCode)
        val credits: TextView = findViewById(R.id.tvCredits)
        val require: TextView = findViewById(R.id.tvRequire)
        val details: TextView = findViewById(R.id.tvDetails)

        //Assigns value to elements according to retrieved index
        when(index){
            "0" -> {
                name.text = "Computer Information Systems"
                code.text = "ITT101"
                credits.text = "3"
                require.text = "none"
                details.text = "Basics in using and operating a computer system"
            }
            "1" -> {
                name.text = "Discrete Mathematics 1"
                code.text = "ITT102"
                credits.text = "3"
                require.text = "none"
                details.text = "What are discrete mathematical structures? Discrete mathematical structures are also known as Decision Mathematics or Finite Mathematics. This is very popularly used in computer science for developing programming languages, software development, cryptography, algorithms etc."
            }
            "2" -> {
                name.text = "Programming Techniques"
                code.text = "ITT103"
                credits.text = "3"
                require.text = "ITT101"
                details.text = "Learn the basics of programming and computer science."
            }
            "3" -> {
                name.text = "Database Management Systems 1"
                code.text = "ITT104"
                credits.text = "3"
                require.text = "ITT103"
                details.text = "This covers the basics of working with databases"
            }
            "4" -> {
                name.text = "Computer Essentails and Troubleshooting"
                code.text = "ITT106"
                credits.text = "3"
                require.text = "ITT101"
                details.text = "Learn how to build computer systems from scratch and how to fix them"
            }
            "5" -> {
                name.text = "Object Oriented Programming Using C++ "
                code.text = "ITT200"
                credits.text = "3"
                require.text = "ITT103"
                details.text = "Learn object oriented programming concepts using the C++ language"
            }
            "6" -> {
                name.text = "Data Communications & Networks"
                code.text = "ITT201"
                credits.text = "3"
                require.text = "ITT101"
                details.text = "Learn everything you need to know to build computer network systems"
            }
            "7" -> {
                name.text = "Internet Authoring 1"
                code.text = "ITT208"
                credits.text = "3"
                require.text = "ITT103"
                details.text = "BLearn how to Build websites and web apps"
            }
            "8" -> {
                name.text = "Data Structures and File Management 1 "
                code.text = "ITT203"
                credits.text = "3"
                require.text = "ITT101"
                details.text = "Learn how to manage datastructures in a large enterprise systems"
            }
            "9" -> {
                name.text = "Systems Analysis & Design "
                code.text = "ITT205"
                credits.text = "3"
                require.text = "ITT210 "
                details.text = "Learn how to analyze and design computer systems and data structures"
            }





    }
}

}