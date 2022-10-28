package com.example.ln_tickets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ScreenBoletos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_boletos)

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

        val partido1 = findViewById<Button>(R.id.partido1)
        partido1.setOnClickListener{
            val pantallaasientos = Intent(this, ScreenAsientos::class.java)
            startActivity(pantallaasientos)
        }
    }
}