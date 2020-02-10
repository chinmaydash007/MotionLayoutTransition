package com.example.motionlayoutkotlin.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.motionlayoutkotlin.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var bundle: Bundle? = intent.extras?.getBundle("google")
        var msg = bundle?.getString("message")
        textView.text = msg
    }
}
