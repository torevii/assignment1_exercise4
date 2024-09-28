package com.example.asd123
import Feed
import FeedAdtr
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val postList = listOf(
            Feed(R.drawable.g4, "PARTY!"),
            Feed(R.drawable.g2, "My music"),
            Feed(R.drawable.g1, "Relax")
        )

        recyclerView.adapter = FeedAdtr(postList)
    }
}
