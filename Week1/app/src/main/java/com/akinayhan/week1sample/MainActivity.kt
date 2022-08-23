package com.akinayhan.week1sample
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akinayhan.week1sample.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso
import java.util.*

class MainActivity : AppCompatActivity() {
    //binding bağlam sınıfını kullanıyoruz.
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main) yerine binding kullanıyoruz
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //picasso ile internetten imageView e resim çekiyoruz.
        Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(binding.imageView)

        //buton tıklama eventi.
        binding.mybutton.setOnClickListener {
            //Butona tıklandığında çalışacak fonksiyonumuzu çağırıyoruz.
            rollDice()
        }
    }

    private fun rollDice() {
        val randomNumber = Random().nextInt(6)+1
        val drawableResource = when (randomNumber){
            1->R.drawable.ic_dice_1
            2->R.drawable.ic_dice_2
            3->R.drawable.ic_dice_3
            4->R.drawable.ic_dice_4
            5->R.drawable.ic_dice_5
            else->R.drawable.ic_dice_6
        }
        binding.imageView.setImageResource(drawableResource)
    }
    


}