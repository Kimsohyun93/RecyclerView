package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting recyclerview from xml
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        //adding a layoutmanager
        //recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val manager = LinearLayoutManager(this)
        recyclerView.layoutManager = manager

        //crating an arraylist to store users using the data class user
        val users = ArrayList<User>()

        //adding some dummy data to the list
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        users.add(User("김소현", "Kimsohyun"))
        //creating our adapter
        val adapter = CustomAdapter(users)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter
    }
}