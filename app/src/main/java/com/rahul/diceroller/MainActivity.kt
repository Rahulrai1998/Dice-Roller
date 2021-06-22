package com.rahul.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {

    lateinit var imgDice: ImageView
    lateinit var btnCount:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgDice = findViewById(R.id.imgDice)
        btnCount = findViewById(R.id.btnCount)
        btnCount.setOnClickListener{
            //Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice(){
        val randomNum = Random().nextInt(6)+1
        val drawDice = when(randomNum){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }
        imgDice.setImageResource(drawDice)

    }
}
