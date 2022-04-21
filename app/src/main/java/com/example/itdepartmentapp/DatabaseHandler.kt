package com.example.itdepartmentapp

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.io.*

class DatabaseHandler(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, 1)  {

    companion object {
        val DATABASE_NAME = "itdepartment.db"
        val TABLE_NAME = "courses"
        val ID = "ID"
        val Code = "Code"
        val Name = "Name"
        val credits = "credits"
        val Prerequsite = "Prerequsite"
        val Details = "Details"
    }






    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("create table $TABLE_NAME (ID INTEGER PRIMARY KEY AUTOINCREMENT,Code TEXT,Name INTEGER,credits TEXT, prerequsite TEXT, Details Text)")



    }

   override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
       db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)


       onCreate(db)
    }

    //Insert data into text_books_table
    fun insertData(code: String, Name: String, credits: String, Prerequsite: String, Details: String) {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(Code, code)
        contentValues.put(Name, Name)
        contentValues.put(credits, credits)
        contentValues.put(Prerequsite,Prerequsite)
        contentValues.put(Details,Details)
        db.insert(TABLE_NAME, null, contentValues)
    }

    //List all books in text_books_table
    fun listOfCourses(): ArrayList<courseInfo>  {
        val db = this.readableDatabase
        val res = db.rawQuery("select * from " + TABLE_NAME, null)
        val courselist = ArrayList<courseInfo>()
        while (res.moveToNext()) {
            var courseInfo = courseInfo()
            courseInfo.id = Integer.valueOf(res.getString(0))
            courseInfo.code = res.getString(1)
            courseInfo.name = res.getString(2)
            courseInfo.credits = res.getString(3)
            courseInfo.prerequisite = res.getString(4)
            courseInfo.details = res.getString(4)
            courselist.add(courseInfo)
        }
        return courselist
    }


    //Getting all book list
    @SuppressLint("Range")
    fun getAllBookData(): ArrayList<courseInfo> {
        val stuList: ArrayList<courseInfo> = arrayListOf<courseInfo>()
        val cursor: Cursor = getReadableDatabase().query(TABLE_NAME, arrayOf(ID, Code, Name, credits, Prerequsite,
            Details), null, null, null, null, null)
        cursor.use { cursor ->
            if (cursor.getCount() != 0) {
                cursor.moveToFirst()
                if (cursor.getCount() > 0) {
                    do {
                        val id : Int = cursor.getInt(cursor.getColumnIndex(ID))
                        val code: String = cursor.getString(cursor.getColumnIndex(Code))
                        val name: String = cursor.getString(cursor.getColumnIndex(Name))
                        val credits: String = cursor.getString(cursor.getColumnIndex(credits))
                        val prerequisite: String =  cursor.getString(cursor.getColumnIndex(Prerequsite))
                        val details: String =  cursor.getString(cursor.getColumnIndex(Details))
                        var courseInfo = courseInfo()
                        courseInfo.id = id
                        courseInfo.code = code
                        courseInfo.name = name
                        courseInfo.credits = credits
                        courseInfo.prerequisite = prerequisite
                        courseInfo.details = details

                        stuList.add(courseInfo)
                    } while ((cursor.moveToNext()))
                }
            }
        }

        return stuList
    }

    @SuppressLint("Range")
    fun getParticularBookData(id: String): courseInfo {
        var courseInfo  = courseInfo()
        val db = this.readableDatabase
        val selectQuery = "SELECT  * FROM " + TABLE_NAME + " WHERE " + ID + " = '" + id + "'"
        val cursor = db.rawQuery(selectQuery, null)
        try {
            if (cursor.getCount() != 0) {
                cursor.moveToFirst();
                if (cursor.getCount() > 0) {
                    do {
                        courseInfo.id = cursor.getInt(cursor.getColumnIndex(ID))
                        courseInfo.code = cursor.getString(cursor.getColumnIndex(Code))
                        courseInfo.name = cursor.getString(cursor.getColumnIndex(Name))
                        courseInfo.credits = cursor.getString(cursor.getColumnIndex(credits))
                        courseInfo.prerequisite = cursor.getString(cursor.getColumnIndex(Prerequsite))
                        courseInfo.details = cursor.getString(cursor.getColumnIndex(Details))
                    } while ((cursor.moveToNext()));
                }
            }
        } finally {
            cursor.close();
        }
        return courseInfo
    }

    //Update course record
    fun updateData(id: String, code: String, Name: String, credits: String, Prerequsite: String, Details: String): Boolean {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(ID, id)
        contentValues.put(Code, code)
        contentValues.put(Name, Name)
        contentValues.put(credits, credits)
        contentValues.put(Prerequsite,Prerequsite)
        contentValues.put(Details,Details)
        db.update(TABLE_NAME, contentValues, "ID = ?", arrayOf(id))
        return true
    }

    //Delete table entry
    fun deleteData(id : String) : Int {
        val db = this.writableDatabase
        return db.delete(TABLE_NAME,"ID = ?", arrayOf(id))

    }



}