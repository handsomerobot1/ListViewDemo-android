package com.example.listviewdemo

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val name= arrayListOf<String>("abir","brain","bond","man")
    val desc = arrayListOf<String>(
        "man in black",
        "man in black",
        "man in black",
        "man in black"
    )
    val imageId = arrayOf<Int>(
        R.drawable.istockphoto,
        R.drawable.istockphoto,
        R.drawable.istockphoto,
        R.drawable.istockphoto
    )
    private lateinit var listview:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    listview=findViewById(R.id.list_item)
        val myListAdapter = MyListAdapter(this,name,desc,imageId)
        listview.adapter=myListAdapter

    }
}