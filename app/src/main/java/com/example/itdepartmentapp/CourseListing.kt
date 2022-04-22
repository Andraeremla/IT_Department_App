package com.example.itdepartmentapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*


class CourseListing : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_listing)

        //Reads faculty list from items in strings.xml file
        val courseList: Array<String> = resources.getStringArray(R.array.timetable)
        //Creates adapter that sets list type and list item
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, courseList)

        val listView: ListView = findViewById(R.id.lvCoursesList)
        //ListView control populated with list items
        listView.adapter = adapter

        //Defines action when list item is clicked
        listView.setOnItemClickListener { parent, view, position, id ->
            //Displays a message showing list item index
           //Toast.makeText(this, "Clicked item : "+position, Toast.LENGTH_SHORT).show()
            //Specifies which activity should be launched
            val intent = Intent(this, CoursesView::class.java);
            //Stores index number to be shared with Details activity
            intent.putExtra("listIndex", position.toString());
            //Starts activity
            this.startActivity(intent);
        }

        }


    }



