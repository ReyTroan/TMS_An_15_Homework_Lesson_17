package com.example.tms_an_15_homework_lesson_17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FifthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        val button = findViewById<Button>(R.id.btnFiftAct)

        button.setOnClickListener {
            val intent = Intent(this, SixActivity::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.btnEnd5)

        button2.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.btnGo5)

        button3.setOnClickListener {
            val intent = Intent(this, FinalActivity::class.java)
            startActivity(intent)
        }
    }
}