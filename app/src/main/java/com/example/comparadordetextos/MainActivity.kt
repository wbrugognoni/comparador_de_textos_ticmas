package com.example.comparadordetextos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1 = findViewById<AppCompatEditText>(R.id.text1)
        val text2 = findViewById<AppCompatEditText>(R.id.text2)
        val btnCompare = findViewById<AppCompatButton>(R.id.bttn)
        val resultText = findViewById<AppCompatTextView>(R.id.result)

        btnCompare.setOnClickListener {
            var firstText = text1.text.toString()
            var secondText = text2.text.toString()
            Log.i("WilsonDev", "Boton de comparar pulsado")
            if (firstText.isNotEmpty() && secondText.isNotEmpty()) {
                Log.i("WilsonDev", "Los campos no estan vacios")
                if (firstText == secondText) {
                    resultText.setText("Los textos son iguales!")
                } else {
                    resultText.setText("Los textos no son iguales!")
                }
            } else {
                Log.i("WilsonDev", "Uno o ambos campos estan vacios")
                resultText.setText("Uno o ambos campos estan vacios!")
            }
        }
    }
    }