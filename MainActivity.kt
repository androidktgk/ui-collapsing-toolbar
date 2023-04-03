package com.example.uidesigns

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uidesigns.adapter.ListAdapter

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    @SuppressLint("AppCompatMethod")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        recyclerView=findViewById(R.id.itemRecycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ListAdapter(arrayListOf("Hello","Kotlin","Android"))

    }
}