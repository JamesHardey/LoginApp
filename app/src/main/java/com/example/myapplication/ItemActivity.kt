package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ItemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fact_item)

        val logo = findViewById<ImageView>(R.id.programLogo)
        val description = findViewById<TextView>(R.id.description)

        //set title for Appbar
        title = intent.extras?.getString("title")

        //get content image
        val image =intent.extras?.getInt("logo")
        val desc = intent.extras?.getString("desc")

        logo.setImageResource(image!!)

        description.text = desc
    }


}