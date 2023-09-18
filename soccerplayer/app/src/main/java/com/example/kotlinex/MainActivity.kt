package com.example.kotlinex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.kotlinex.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var isdouble = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var player = arrayOf(
            R.id.ederson,
            R.id.walker,
            R.id.dias,
            R.id.stones,
            R.id.akanji,
            R.id.silva,
            R.id.rodri,
            R.id.db,
            R.id.jack,
            R.id.haaland,
            R.id.foden
        )


        var names = mutableListOf<String>(
            "Ederson",
            "Walker",
            "Dias",
            "Stones",
            "Akanji",
            "Silva",
            "Rodri",
            "De Bruyne",
            "Grealish",
            "Haaland",
            "Foden"
        )
        //화면 클릭 인지
        for (item in player) {

            var image = findViewById<ImageView>(item)
            image.setOnClickListener {
                //화면 클릭되면 다음 화면으로 넘어가서 사진 보여줌
                Toast.makeText(this, item.toString(), Toast.LENGTH_SHORT).show()

                val intent = Intent(this, RodriActivity::class.java)
                for (i in 0..9) {
                    if (item == player[i]) {
                        intent.putExtra("player", names[i])
                    }
                }

                startActivity(intent)
            }
        }


        //바인딩을 통해 코드를 더 줄일 수 있음

        var player1 = binding.randomman

        binding.randomBtnId.setOnClickListener {
            val num1 = Random.nextInt(1, 11)
//
//            for (i in 1..11){
//                if (num1 == i){
//                    player1.setImageResource(player[i+1])
//                }
//            }
            if (num1 == 1) {
                player1.setImageResource(R.drawable.ederson)
            } else if (num1 == 2) {
                player1.setImageResource(R.drawable.walker)
            } else if (num1 == 3) {
                player1.setImageResource(R.drawable.dias)
            } else if (num1 == 4) {
                player1.setImageResource(R.drawable.stones)
            } else if (num1 == 5) {
                player1.setImageResource(R.drawable.akanji)
            } else if (num1 == 6) {
                player1.setImageResource(R.drawable.silva)
            } else if (num1 == 7) {
                player1.setImageResource(R.drawable.rodri)
            } else if (num1 == 8) {
                player1.setImageResource(R.drawable.db)
            } else if (num1 == 9) {
                player1.setImageResource(R.drawable.jack)
            } else if (num1 == 10) {
                player1.setImageResource(R.drawable.haaland)
            } else if (num1 == 11) {
                player1.setImageResource(R.drawable.foden)

            }
        }



    }

    override fun onBackPressed() {
    if(isdouble ==true){
        finish()
    }
        isdouble = true
        Toast.makeText(this, "한번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show()
        Handler().postDelayed(Runnable { isdouble = false }, 3000)
    }
}
