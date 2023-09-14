package com.example.kotlinex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var player = arrayOf(R.id.ederson,R.id.walker,R.id.dias,R.id.stones,R.id.akanji,R.id.silva,R.id.rodri,R.id.db,R.id.jack,R.id.haaland)


        var names = arrayOf("Ederson","Walker","Dias","Stones","Akanji","Silva","Rodri","De Bruyne","Grealish","Haaland")
        //화면 클릭 인지
        for (item in player) {

            var image = findViewById<ImageView>(item)
            image.setOnClickListener {
                //화면 클릭되면 다음 화면으로 넘어가서 사진 보여줌
                Toast.makeText(this, item.toString(), Toast.LENGTH_SHORT).show()

                val intent = Intent(this, RodriActivity::class.java)
                for (i in 0..9){
                    if (item == player[i]){
                        intent.putExtra("player", names[i])
                    }
                }

                startActivity(intent)
            }
        }


    }
}