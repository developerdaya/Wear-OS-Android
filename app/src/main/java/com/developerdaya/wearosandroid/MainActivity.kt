package com.developerdaya.wearosandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create a list of users
        val users = listOf(
            User("Daya"),
            User("Vijay"),
            User("Virat"),
            User("Ram"),
            User("Shyam"),
            User("Geeta")
        )

        // Find the RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Set the layout manager and adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UserAdapter(users)
    }
}
