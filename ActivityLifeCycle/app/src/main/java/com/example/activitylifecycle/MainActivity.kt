package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "onCreate method")
    }



    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart method")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart method")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume method")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop method")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy method")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause method")
    }
}