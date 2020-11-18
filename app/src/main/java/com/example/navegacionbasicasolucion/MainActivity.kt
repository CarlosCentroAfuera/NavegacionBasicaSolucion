package com.example.navegacionbasicasolucion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etTextoInicial
        bUno.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
        bDos.setOnClickListener {
            val intent = Intent(this, Activity3::class.java)
            intent.putExtra(Activity3.CLAVE, "El edit text de la activity anterior tenía una longitud de ${etTextoInicial.text.length} caracteres")
            startActivity(intent)
        }
        bTres.setOnClickListener {
            if (Random.nextBoolean()){
                val intent = Intent(this, Activity2::class.java)
                intent.putExtra(Activity2.CLAVE, R.mipmap.google)
                startActivity(intent)
            } else {
                val intent = Intent(this, Activity3::class.java)
                intent.putExtra(Activity3.CLAVE, "El edit text de la activity anterior contenía: ${etTextoInicial.text.toString().toUpperCase(Locale.getDefault())}")
                startActivity(intent)
            }
        }

    }
}