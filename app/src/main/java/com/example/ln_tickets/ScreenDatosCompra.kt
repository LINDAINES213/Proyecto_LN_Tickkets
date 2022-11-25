package com.example.ln_tickets

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.google.zxing.BarcodeFormat
import com.journeyapps.barcodescanner.BarcodeEncoder


class ScreenDatosCompra : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_datos_compra)

        var dpi: EditText=findViewById(R.id.dpi)
        var codigo: ImageView=findViewById(R.id.codigo)

        var button: Button = findViewById(R.id.button)


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

        button.setOnClickListener(View.OnClickListener {
            try{
                var barcodeEncoder: BarcodeEncoder = BarcodeEncoder()
                var bitmap: Bitmap = barcodeEncoder.encodeBitmap(
                    dpi.text.toString(),
                    BarcodeFormat.QR_CODE,
                    750,
                    750,
                )

                codigo.setImageBitmap(bitmap)

            } catch (e: java.lang.Exception){
                e.printStackTrace()
            }
        })


    }

   /** fun Enviar(view: View){
        var nom=nombre?.text.toString()
        var asi=asientos?.text.toString()
        var intento=Intent(this, CompraFinal::class.java)
        intento.putExtra("nom", nom)
        intento.putExtra("asi", asi)
        BarcodeEncoder barcodeEncoder = new BarcodeEncoder()
        startActivity(intento)
    }*/
}