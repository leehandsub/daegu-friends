package com.example.daegucocktail

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Base64
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.security.MessageDigest

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

        try {
            val info =
                packageManager.getPackageInfo(packageName, PackageManager.GET_SIGNATURES)
            for (signature in info.signatures) {
                var md: MessageDigest
                md = MessageDigest.getInstance("SHA")
                md.update(signature.toByteArray())
                val something = String(Base64.encode(md.digest(), 0))
                Log.e("Hash key", something)
            }
        } catch (e: Exception) {
            Log.e("name not found", e.toString())
        }//해쉬키 얻는 코드
    }
}