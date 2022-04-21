package com.example.itdepartmentapp

import android.os.Bundle
import android.util.Log
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*


class CourseListing : AppCompatActivity() {
    private var helper = DatabaseHandler(this)


    //private lateinit var dbref : DatabaseReference
    //private lateinit var listView: ListView = findViewById(R.id.lvCoursesList)
    //private lateinit var courseArrayList : ArrayList<courseInfo>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_listing)
        helper.insertData("ITT101" ,"Computer Information Systems","3","none", "Basics in using and operating a computer system")

        var listData: ArrayList<courseInfo> = helper.listOfCourses()


        var listView: ListView = findViewById(R.id.lvCoursesList)
        var listAdapter = CLAdapter(this, listData)
        listView.adapter = listAdapter


        }


    }



