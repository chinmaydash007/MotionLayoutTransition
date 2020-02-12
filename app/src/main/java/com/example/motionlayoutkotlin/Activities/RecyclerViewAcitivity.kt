package com.example.motionlayoutkotlin.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.motionlayoutkotlin.Adapter.HobbiesAdapter
import com.example.motionlayoutkotlin.R
import com.example.motionlayoutkotlin.model.supplier
import kotlinx.android.synthetic.main.activity_recycler_view_acitivity.*

class RecyclerViewAcitivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_acitivity)
        var layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        var hobbiesAdapter = HobbiesAdapter(this, supplier.hobbies)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = hobbiesAdapter

    }
}
