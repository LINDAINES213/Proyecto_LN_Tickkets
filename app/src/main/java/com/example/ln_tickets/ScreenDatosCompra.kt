package com.example.ln_tickets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText


class ScreenDatosCompra : AppCompatActivity() {

    private var nombre:EditText?=null
    private var asientos:EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_datos_compra)

        nombre=findViewById(R.id.nombre)

        val boletos = findViewById<Button>(R.id.boletos)
        boletos.setOnClickListener{
            val pantallaboletos = Intent(this, ScreenBoletos::class.java)
            startActivity(pantallaboletos)
        }

        val inicio = findViewById<Button>(R.id.inicio)
        inicio.setOnClickListener{
            val pantallainicio = Intent(this, HomePage::class.java)
            startActivity(pantallainicio)
        }

        val noticias = findViewById<Button>(R.id.noticias)
        noticias.setOnClickListener{
            val pantallanoticias = Intent(this, ScreenNoticias::class.java)
            startActivity(pantallanoticias)
        }


    }

    fun Enviar(view: View){
        var nom=nombre?.text.toString()
        //var asi=asientos?.text.toString()
        var intento=Intent(this, CompraFinal::class.java)
        intento.putExtra("nom", nom)
        //intento.putExtra("asi", asi)
        startActivity(intento)
    }
}