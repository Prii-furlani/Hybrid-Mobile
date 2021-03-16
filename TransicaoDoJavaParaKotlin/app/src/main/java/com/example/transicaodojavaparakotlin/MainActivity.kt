package com.example.transicaodojavaparakotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var nome : String? = null
    var contador : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pessoa = Pessoa(nome:"Priscila", email:"prii.mfurlani@gmail.com")
        var pessoa

    }

    fun soma(a:Int, b:Int):Int{
        return a + b
    }

}
class Pessoa(var nome:String, var email:String)