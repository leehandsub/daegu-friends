package com.example.daegucocktail

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val findCocktail = findViewById<Button>(R.id.btnFindCocktail)
        val myCocktail = findViewById<Button>(R.id.btnMyCocktail)

        findCocktail.setOnClickListener {
            startActivity(Intent(this@MainActivity, MapActivity::class.java))
        }
        myCocktail.setOnClickListener {
            startActivity(Intent(this@MainActivity, MyCocktailActivity::class.java))
        }
    }
}