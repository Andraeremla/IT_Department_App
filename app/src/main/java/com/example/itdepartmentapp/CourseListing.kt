package com.example.itdepartmentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class CourseListing : AppCompatActivity() {
    private var helper = DatabaseHandler(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_listing)

        var listData: ArrayList<courseInfo> = helper.listOfCourses()

        var listView: ListView = findViewById(R.id.lvCoursesList)
        var listAdapter = CLAdapter(this, listData)
        listView.adapter = listAdapter

        /*listView.setOnItemClickListener { _, _, position, _ ->
            var intent = Intent(this, ADD::class.java)
            intent.putExtra("ADD", false)
            intent.putExtra("ID",listData[position].id)
            startActivity(intent)
        }
        */


    }
}