package com.example.listviewdemo

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyListAdapter(private val context:Activity, private val name:ArrayList<String>, private val textView:ArrayList<String>, private val image: Array<Int>):ArrayAdapter<String>(context,R.layout.item_layout,name) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
       val inflater =context.layoutInflater
        val rowView = inflater.inflate(R.layout.item_layout,null ,true )
        val nameText= rowView.findViewById<TextView>(R.id.textView)
       val descriptionText = rowView.findViewById<TextView>(R.id.textView2)
        val profileImage = rowView.findViewById<CircleImageView>(R.id.circleImageView)


        nameText.text =name[position]
       descriptionText.text=textView[position]
        profileImage.setImageResource(image[position])
        return rowView
    }
}