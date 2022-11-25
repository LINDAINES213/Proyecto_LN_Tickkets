package com.example.ln_tickets

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.google.zxing.BarcodeFormat
import com.journeyapps.barcodescanner.BarcodeEncoder

class ScreenDatosCompraGeneral : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_datos_compra_general)

        var dpi: EditText =findViewById(R.id.dpi)
        var codigo: ImageView =findViewById(R.id.codigo)

        var button: Button = findViewById(R.id.button)

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
}