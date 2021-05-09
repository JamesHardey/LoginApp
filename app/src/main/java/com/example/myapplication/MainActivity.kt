package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import java.time.Duration


class MainActivity : AppCompatActivity() {
    private val username = "admin"
    private val password = "admin1234"
    lateinit var user : TextInputEditText
    lateinit var pass : TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        user = findViewById<TextInputEditText>(R.id.username)
        pass = findViewById<TextInputEditText>(R.id.password)
        val button = findViewById<MaterialButton>(R.id.btn)

        button.setOnClickListener{
            if(loginConfirm()){
                showListView()
            }

        }
    }

    private fun showListView(){
        val intent = Intent(this@MainActivity,SecondActivity::class.java)
        startActivity(intent)
    }

    private fun loginConfirm():Boolean{
        if (user.text?.isEmpty()!!|| pass.text?.isEmpty()!!){
            return false
        }
        else if(!(user.toString().equals(username,true)&& pass.toString().equals(password))){
            Toast.makeText(this,"Incorrect username or password",Toast.LENGTH_SHORT)
            return false
        }
        else {
            Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT)
            return true
        }
    }


}
