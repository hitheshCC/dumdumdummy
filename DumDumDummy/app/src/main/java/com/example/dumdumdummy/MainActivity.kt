package com.example.dumdumdummy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(add(4, 5))
       
    }
    
    fun add(a: Int, b: String): Int {
        return a + b.toInt()
    }
}
