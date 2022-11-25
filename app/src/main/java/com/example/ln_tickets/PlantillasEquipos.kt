package com.example.ln_tickets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.net.Uri

class PlantillasEquipos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_plantillas)

        val boletos = findViewById<Button>(R.id.boletos)
        boletos.setOnClickListener {
            val pantallaboletos = Intent(this, ScreenBoletos::class.java)
            startActivity(pantallaboletos)
        }

        val inicio = findViewById<Button>(R.id.inicio)
        inicio.setOnClickListener {
            val pantallainicio = Intent(this, HomePage::class.java)
            startActivity(pantallainicio)
        }

        val noticias = findViewById<Button>(R.id.noticias)
        noticias.setOnClickListener {
            val pantallanoticias = Intent(this, ScreenNoticias::class.java)
            startActivity(pantallanoticias)
        }

        val achuapa = findViewById<Button>(R.id.achuapa)
        achuapa.setOnClickListener {
            val url = "https://www.transfermarkt.es/deportivo-achuapa/startseite/verein/38141"
            val ach = Intent(Intent.ACTION_VIEW)
            ach.data = Uri.parse(url)
            startActivity(ach)
        }

        val antigua = findViewById<Button>(R.id.antigua)
        antigua.setOnClickListener {
            val url = "https://www.transfermarkt.es/antigua-gfc/startseite/verein/19006/saison_id/2022"
            val ant = Intent(Intent.ACTION_VIEW)
            ant.data = Uri.parse(url)
            startActivity(ant)
        }

        val coban = findViewById<Button>(R.id.coban)
        coban.setOnClickListener {
            val url = "https://www.transfermarkt.es/coban-imperial/startseite/verein/6800/saison_id/2022"
            val cob = Intent(Intent.ACTION_VIEW)
            cob.data = Uri.parse(url)
            startActivity(cob)
        }

        val comunicaciones = findViewById<Button>(R.id.comunicaciones)
        comunicaciones.setOnClickListener {
            val url = "https://www.transfermarkt.es/comunicaciones-fc/startseite/verein/9709/saison_id/2022"
            val com = Intent(Intent.ACTION_VIEW)
            com.data = Uri.parse(url)
            startActivity(com)
        }

        val guastatoya = findViewById<Button>(R.id.guastatoya)
        guastatoya.setOnClickListener {
            val url = "https://www.transfermarkt.es/deportivo-guastatoya/startseite/verein/45174/saison_id/2022"
            val gua = Intent(Intent.ACTION_VIEW)
            gua.data = Uri.parse(url)
            startActivity(gua)
        }

        val iztapa = findViewById<Button>(R.id.iztapa)
        iztapa.setOnClickListener {
            val url = "https://www.transfermarkt.es/deportivo-iztapa/startseite/verein/42446/saison_id/2022"
            val izt = Intent(Intent.ACTION_VIEW)
            izt.data = Uri.parse(url)
            startActivity(izt)
        }

        val malacateco = findViewById<Button>(R.id.malacateco)
        malacateco.setOnClickListener {
            val url = "https://www.transfermarkt.es/cd-malacateco/startseite/verein/19066/saison_id/2022"
            val mal = Intent(Intent.ACTION_VIEW)
            mal.data = Uri.parse(url)
            startActivity(mal)
        }

        val mixco = findViewById<Button>(R.id.mixco)
        mixco.setOnClickListener {
            val url = "https://www.transfermarkt.es/deportivo-mixco/startseite/verein/35101/saison_id/2022"
            val mix = Intent(Intent.ACTION_VIEW)
            mix.data = Uri.parse(url)
            startActivity(mix)
        }

        val municipal = findViewById<Button>(R.id.municipal)
        municipal.setOnClickListener {
            val url = "https://www.transfermarkt.es/csd-municipal/startseite/verein/13047/saison_id/2022"
            val mun = Intent(Intent.ACTION_VIEW)
            mun.data = Uri.parse(url)
            startActivity(mun)
        }

        val santalucia = findViewById<Button>(R.id.santalucia)
        santalucia.setOnClickListener {
            val url = "https://www.transfermarkt.es/santa-lucia-cotzumalguapa-fc/startseite/verein/51397/saison_id/2022"
            val cot = Intent(Intent.ACTION_VIEW)
            cot.data = Uri.parse(url)
            startActivity(cot)
        }

        val xelaju = findViewById<Button>(R.id.xelaju)
        xelaju.setOnClickListener {
            val url = "https://www.transfermarkt.es/csd-xelaju-mc/startseite/verein/18578/saison_id/2022"
            val xel = Intent(Intent.ACTION_VIEW)
            xel.data = Uri.parse(url)
            startActivity(xel)
        }

        val xinabajul = findViewById<Button>(R.id.xinabajul)
        xinabajul.setOnClickListener {
            val url = "https://www.transfermarkt.es/deportivo-xinabajul/startseite/verein/18939/saison_id/2022"
            val xin = Intent(Intent.ACTION_VIEW)
            xin.data = Uri.parse(url)
            startActivity(xin)
        }
    }
}