package com.example.desafio02

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
        lateinit var imgPessoa : ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgPessoa = findViewById(R.id.imgPessoa)
}

    fun trocarImagem(view: View) {
         val imagem = when (view.id){
             R.id.btnPessoa01 -> R.drawable.iconfinder_female1_403023
             R.id.btnPessoa02 -> R.drawable.iconfinder_boy_403024
             else -> R.drawable.iconfinder_supportfemale_403018
         }
        imgPessoa.setImageResource(imagem)
    }
}