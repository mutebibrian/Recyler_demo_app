package com.kolin.recyler_demo_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //step 1 getting recyclerview by its id
        val recylerview = findViewById<RecyclerView>(R.id.rv)

        //step2 create vertical layout manager
        recylerview.layoutManager=LinearLayoutManager(this)
        //step 3 create array list of itemsviewmodel
        val data =  ArrayList<itemviewmodel>()
        //step 4 This loop create 20 views containing the image with the count of view
        for (i in 1..20){
            data.add(itemviewmodel(R.drawable.baseline_folder_24,"item"+ i))

        }
        //step 5 This will passthe Array List to our Adapter
        val adapter = CustomAdapter(data)
        //step 6 setting the adapter with recycler view
        recylerview.adapter=adapter

    }
}