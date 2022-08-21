package com.akinayhan.week1sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
//import com.squareup.picasso.Picasso
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var button:Button
    private lateinit var imageView:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

        //Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(imageView);

        button.setOnClickListener {
            rollDice()
        }

    }

    private fun init(){
        button = findViewById(R.id.mybutton)
        imageView = findViewById(R.id.imageView)
    }


    private fun rollDice() {
        val randomInt = Random().nextInt(6)+1
        val drawableResource = when (randomInt){
            1->R.drawable.ic_dice_1
            2->R.drawable.ic_dice_2
            3->R.drawable.ic_dice_3
            4->R.drawable.ic_dice_4
            5->R.drawable.ic_dice_5
            else->R.drawable.ic_dice_6
        }
        imageView.setImageResource(drawableResource)
    }
    


}