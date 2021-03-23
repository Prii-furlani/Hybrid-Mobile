package com.example.desafio04

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
        lateinit var imgStar : ImageView
        lateinit var  imgLove :ImageView

    var inverter = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgStar = findViewById(R.id.imgStar)
        imgLove = findViewById(R.id.imgLove)
    }

    fun trocarImagem(view: View) {

        inverter = !inverter

        // tipo 01 de fazer
        if ( inverter ) {
           imgStar.setImageResource(R.drawable.love)
           imgLove.setImageResource(R.drawable.star)
        } else {
            imgStar.setImageResource(R.drawable.star)
            imgLove.setImageResource(R.drawable.love)
        }
        // tipo 02 de fazer
      //  val  img01 = if ( inverter ) R.drawable.star else R.drawable.love
      //  val img02 = if ( inverter ) R.drawable.love else R.drawable.star

     //   imgStar.setImageResource(img01)
     //   imgLove.setImageResource(img02)
    }
}