package com.example.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logging()
        division()
    }

    fun logging() {
        Log.v(TAG, "Hello world!")
    }

    fun division() {
        val numerator = 60
        var denominator = 5
        findViewById<TextView>(R.id.division_textview).setText("${numerator / denominator}")
        repeat(5) {
            Thread.sleep(3000)
            Log.v(TAG, "${numerator / denominator}")
            denominator--
        }
    }
}