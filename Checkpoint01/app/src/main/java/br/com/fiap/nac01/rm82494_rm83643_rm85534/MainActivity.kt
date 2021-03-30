package br.com.fiap.nac01.rm82494_rm83643_rm85534

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {
    /*
    *
    * */
    lateinit var imgPessoa : ImageView
    
    var posicao = 0

    val  imagens = intArrayOf(
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

    /*
    * Calcula qual é a imagem anterior da galeria
    * */
    fun anterior(view: View) {
        if( posicao <= 0 ){
            Toast.makeText(this, "Você nao pode retroceder", Toast.LENGTH_SHORT).show()
            return
        }
        posicao--

        trocarImagem( posicao )
    }

    fun proximo(view: View) {
        if ( posicao >= imagens.size - 1 ) {
            Toast.makeText(this, "Você nao pode avançar", Toast.LENGTH_SHORT).show()
        }
        posicao++

        trocarImagem( posicao )
    }

    fun trocarImagem( posicao : Int){
        imgPessoa.setImageResource(imagens[posicao])
        Toast.makeText(this, "Imagem ${posicao + 1 }", Toast.LENGTH_SHORT).show()
    }


}