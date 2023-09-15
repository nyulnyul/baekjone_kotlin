package com.example.kotlinex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.kotlinex.databinding.ActivityRodriBinding

class RodriActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRodriBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rodri)

        val getdata = intent.getStringExtra("player")


        val players = findViewById<ImageView>(R.id.players)

        var player = arrayOf(
            R.drawable.ederson,
            R.drawable.walker,
            R.drawable.dias,
            R.drawable.stones,
            R.drawable.akanji,
            R.drawable.silva,
            R.drawable.rodri,
            R.drawable.db,
            R.drawable.jack,
            R.drawable.haaland
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
            "Haaland"
        )
        for (i in names) {
            if (getdata == i) {
                players.setImageResource(player[names.indexOf(i)])
            }
        }


        binding = DataBindingUtil.setContentView(this, R.layout.activity_rodri)
        binding.showStats.setOnClickListener {
            Toast.makeText(this, "${names.random()}", Toast.LENGTH_SHORT).show()
            val intent =Intent(this, statActivity::class.java)
            startActivity(intent)
        }
        binding.playername.setText(names.random())
    }
}