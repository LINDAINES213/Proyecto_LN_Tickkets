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

        val partido2 = findViewById<Button>(R.id.partido2)
        partido2.setOnClickListener{
            val pantallaasientos = Intent(this, ScreenAsientos::class.java)
            startActivity(pantallaasientos)
        }

        val partido3 = findViewById<Button>(R.id.partido3)
        partido3.setOnClickListener{
            val pantallaasientos = Intent(this, ScreenAsientos::class.java)
            startActivity(pantallaasientos)
        }

        val partido4 = findViewById<Button>(R.id.partido4)
        partido4.setOnClickListener{
            val pantallaasientos = Intent(this, ScreenAsientos::class.java)
            startActivity(pantallaasientos)
        }

        val partido5 = findViewById<Button>(R.id.partido5)
        partido5.setOnClickListener{
            val pantallaasientos = Intent(this, ScreenAsientos::class.java)
            startActivity(pantallaasientos)
        }

        val partido6 = findViewById<Button>(R.id.partido6)
        partido6.setOnClickListener{
            val pantallaasientos = Intent(this, ScreenAsientos::class.java)
            startActivity(pantallaasientos)
        }

    }
}