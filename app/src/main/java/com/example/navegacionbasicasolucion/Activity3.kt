package com.example.navegacionbasicasolucion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_3.*

class Activity3 : AppCompatActivity() {

    companion object {
        const val CLAVE = "MiClave"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        tvResultado.text = intent.getStringExtra(CLAVE)
    }
}