package com.example.testmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        rvMain.layoutManager = LinearLayoutManager(this)
        rvMain.adapter = MainAdapter(arrayListOf(
            "Test 1",
            "Test 2",
            "Test 3"
        ))
    }
}
