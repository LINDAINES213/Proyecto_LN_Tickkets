package com.example.ln_tickets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CompraFinal : AppCompatActivity() {

    private var nombre2:TextView?=null
    private var asientos2:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compra_final)

        nombre2=findViewById(R.id.nombre2)
        asientos2=findViewById(R.id.asientos2)
        val nom2=intent.getStringExtra("nom2")
        val asi2 = intent.getStringExtra("asi2")
        nombre2?.text="Nombre Comprador: $nom2"
        asientos2?.text="Cantidad de Asientos: $asi2"

    }
}