package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import java.util.regex.Matcher
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    private val username = "admin"
    private val password = "admin1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val user = findViewById<TextInputEditText>(R.id.username)
        val pass = findViewById<TextInputEditText>(R.id.password)
        val button = findViewById<MaterialButton>(R.id.btn)

        button
    }

    private fun loginConfirm(user:TextInputEditText,pass:TextInputEditText):Boolean{

        if(user.text?.isEmpty()!!){
           user.error="Cant be Empty"
        }
        if(pass.text?.isEmpty()!!){
            pass.error="Cant be Empty"
        }

        if(!(user.toString().equals(username,true)&& pass.toString().equals(password))){
            return false
        }
        else {
            return true
        }
    }

    private fun showListView(){
        val intent = Intent(this@MainActivity,SecondActivity::class.java)
        startActivity(intent)
    }
}
