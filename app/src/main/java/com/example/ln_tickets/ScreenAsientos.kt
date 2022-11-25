package com.example.ln_tickets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ScreenAsientos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_asientos)

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

        val tribuna = findViewById<Button>(R.id.tribuna)
        tribuna.setOnClickListener {
            val pantallaboletovendido = Intent(this, ScreenDatosCompraTribuna::class.java)
            startActivity(pantallaboletovendido)
        }

        val preferencia = findViewById<Button>(R.id.preferencia)
        preferencia.setOnClickListener {
            val pantallaboletovendido = Intent(this, ScreenDatosCompraPreferencia::class.java)
            startActivity(pantallaboletovendido)
        }

        val general = findViewById<Button>(R.id.general)
        general.setOnClickListener {
            val pantallaboletovendido = Intent(this, ScreenDatosCompraTribuna::class.java)
            startActivity(pantallaboletovendido)
        }

        val volver = findViewById<Button>(R.id.volver)
        volver.setOnClickListener {
            val pantallaboletos = Intent(this, ScreenBoletos::class.java)
            startActivity(pantallaboletos)
        }

    }
}