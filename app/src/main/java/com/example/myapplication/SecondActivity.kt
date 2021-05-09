package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_view)

        val listView= findViewById<ListView>(R.id.factListView)
        val listData= ArrayList<FactModel>()
        listData.addAll(DummyData.facts)
        val adapter = FactAdapter(this,listData)

        listView.adapter=adapter
        listView.onItemClickListener = AdapterView.OnItemClickListener{parent, view, position, id ->
            val factModel = listView.getItemAtPosition(position) as FactModel
            val intent = Intent(this@SecondActivity,ItemActivity::class.java)

            intent.putExtra("title",factModel.name)
            intent.putExtra("logo",factModel.logo)
            intent.putExtra("desc",factModel.fact)

            startActivity(intent)

        }

    }


}