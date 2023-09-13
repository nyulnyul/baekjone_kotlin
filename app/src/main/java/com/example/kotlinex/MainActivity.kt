package com.example.kotlinex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //화면 클릭 인지
        val ederson = findViewById<ImageView>(R.id.ederson)
        ederson.setOnClickListener {
            //화면 클릭되면 다음 화면으로 넘어가서 사진 보여줌
            Toast.makeText(this, "에데르송", Toast.LENGTH_SHORT).show()
        }

    }
}