package br.com.fiap.nac01.rm82494_rm83643_rm85534

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var imgPessoa : ImageView

    val  images = intArrayOf(
            R.drawable.p0,
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgPessoa = findViewById(R.id.imgPessoa)
    }


    fun proximo(view: View) {}
    fun anterior(view: View) {}
}