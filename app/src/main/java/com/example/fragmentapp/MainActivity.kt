package com.example.fragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // recuperando id dos buttons
        val btn1: Button = findViewById(R.id.button1)
        val btn2: Button = findViewById(R.id.button2)

        // setando evento de acao apos click no frame
        btn1.setOnClickListener{
            // instanciando Fragment
            val frag1: Fragment = Fragment1()

            // definindo transaction do fragment
            val tranFrag: FragmentTransaction =
                supportFragmentManager.beginTransaction()

            // definindo que a transaction do frame1 vai ser a fragment1
            tranFrag.replace(R.id.frame1, frag1).commit()
        }

        btn2.setOnClickListener {
            // instanciando Fragment
            val frag2: Fragment = Fragment2()

            // definindo transaction do fragment
            val tranFrag: FragmentTransaction =
                supportFragmentManager.beginTransaction()

            // definindo que a transaction do frame1 vai ser a fragment1
            tranFrag.replace(R.id.frame2, frag2).commit()
        }
    }
}