package com.example.test1

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","eman")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","ayman")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","omar")

    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","yehya")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","adam")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity","fatma")

    }
}

