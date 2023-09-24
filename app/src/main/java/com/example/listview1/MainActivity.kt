package com.example.listview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val taskList = arrayListOf<String>()
        taskList.add("Go to Temple")
        taskList.add("Do One leetcode Question")
        taskList.add("Ateend Class")
        taskList.add("Complete the app Project")
        taskList.add("Bring Vegetables from market")
        taskList.add("Work On Resume")
        taskList.add("Search of Internship")

        val adapterForMyListView = ArrayAdapter(this,android.R.layout.simple_list_item_1,taskList)
        listView.adapter = adapterForMyListView

        listView.setOnItemClickListener { adapterView, view, i, l ->
            val text = "Clicked on Item : " + (view as TextView).text.toString()
            Toast.makeText(this,text, Toast.LENGTH_SHORT).show()
        }
    }
}