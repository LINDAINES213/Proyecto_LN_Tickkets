package com.example.ln_tickets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.net.Uri

class ScreenNoticias : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_noticias)

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


        val noticias1 = findViewById<Button>(R.id.noticia1)
        noticias1.setOnClickListener {
            val url = "https://lahora.gt/secciones-para-ti/deportes/agencia-afp/2022/10/16/comunicaciones-sigue-liderando-el-futbol-de-guatemala/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        val noticias2 = findViewById<Button>(R.id.noticia2)
        noticias2.setOnClickListener {
            val url = "https://www.google.com/search?q=liga+nacional&client=opera-gx&hs=cVb&ei=fBtbY_SjJfHIwbkPwciEgAk&ved=0ahUKEwj00aiBz4H7AhVxZDABHUEkAZAQ4dUDCA4&uact=5&oq=liga+nacional&gs_lcp=Cgdnd3Mtd2l6EAMyCwguEIAEELEDEIMBMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyCwguEIAEEMcBEK8BMgUIABCABDIFCAAQgAQyBQguEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOggILhCABBCxAzoICC4QsQMQgwE6EQguEIAEELEDEIMBEMcBENEDOggIABCxAxCDAToOCC4QgAQQsQMQgwEQ1AI6BAgAEEM6BwguELEDEEM6EAguELEDEIMBEMcBENEDEEM6CgguELEDEIMBEEM6CggAELEDEIMBEEM6BAguEEM6BwguENQCEENKBAhBGAFKBAhGGABQugtY7Bxg2iFoA3AAeACAAZQBiAGMC5IBBDMuMTCYAQCgAQHAAQE&sclient=gws-wiz#sie=lg;/g/11s3dds5hq;2;/m/0dfthx;st;fp;1;;;"
            val j = Intent(Intent.ACTION_VIEW)
            j.data = Uri.parse(url)
            startActivity(j)
        }

        val noticias3 = findViewById<Button>(R.id.noticia3)
        noticias3.setOnClickListener {
            val url = "https://www.guatemala.com/deportes/futbol-guatemalteco/programacion-partidos-jornada-16-del-torneo-apertura-2022-liga-nacional.html"
            val k = Intent(Intent.ACTION_VIEW)
            k.data = Uri.parse(url)
            startActivity(k)
        }

        val noticias4 = findViewById<Button>(R.id.noticia4)
        noticias4.setOnClickListener {
            val url = "https://www.google.com/search?q=liga+nacional&client=opera-gx&source=lnms&tbm=nws&sa=X&ved=2ahUKEwjp-YKG5oH7AhWuRjABHVWYDmAQ_AUoBHoECAEQBg&biw=1495&bih=746&dpr=2.5"
            val l = Intent(Intent.ACTION_VIEW)
            l.data = Uri.parse(url)
            startActivity(l)
        }


    }
}