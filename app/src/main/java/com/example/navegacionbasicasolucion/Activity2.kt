package com.example.navegacionbasicasolucion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity(){

    companion object{
        const val CLAVE = "ASDF"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val idRecibido = intent.getIntExtra(CLAVE,0)
        if (idRecibido!=0){
            iwLogo.setImageResource(idRecibido)
        }
    }
}