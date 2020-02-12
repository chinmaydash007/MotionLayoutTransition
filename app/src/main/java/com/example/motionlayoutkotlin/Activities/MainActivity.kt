package com.example.motionlayoutkotlin.Activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.motionlayoutkotlin.R
import com.example.motionlayoutkotlin.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {

            var message:String=editText.text.toString()
            this.showToast(message)
            var intent=Intent().apply {
                action=Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT,"sdfsdf")
                putExtra(Intent.EXTRA_EMAIL,Array<String>(1){"chinmaydash007@gmail.com"})
                putExtra(Intent.EXTRA_SUBJECT,"Asdasd")
                type="text/plain"
            }
            var myIntent=Intent()
            startActivity(Intent.createChooser(intent,"Share to:"))
        }
        button2.setOnClickListener {
            var intent:Intent=Intent(this,
                RecyclerViewAcitivity::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            var intent=Intent(this,
                Main2Activity::class.java)
            startActivity(intent)
        }
    }
}
