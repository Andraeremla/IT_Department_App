package com.example.itdepartmentapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CLAdapter(context: Context, arrayOfData: ArrayList<courseInfo>)  : BaseAdapter() {
    var arrayOfData : ArrayList<courseInfo>
    private val mInflator: LayoutInflater

    init {
        this.arrayOfData = arrayOfData
        this.mInflator = LayoutInflater.from(context)
    }

    override fun getItem(position: Int): Any {
        return arrayOfData[position];
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return arrayOfData.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {

        val view: View?
        val vh: ListRowHolder
        if (convertView == null) {
            view = this.mInflator.inflate(R.layout.course_row, parent, false)
            vh = ListRowHolder(view)
            view.tag = vh
        } else {
            view = convertView
            vh = view.tag as ListRowHolder
        }
        vh.course_name.text = arrayOfData[position].name
        vh.tvCode.text = ""+arrayOfData[position].code
        return view
    }

    private class ListRowHolder(row: View?) {
        public val course_name: TextView
        public val tvCode : TextView

        init {
            this.course_name = row?.findViewById(R.id.course_name) as TextView
            this.tvCode = row?.findViewById(R.id.tvCode) as TextView
        }
    }
}