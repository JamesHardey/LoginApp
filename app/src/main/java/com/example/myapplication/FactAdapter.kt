package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class FactAdapter(context: Context, facts:List<FactModel>):ArrayAdapter<FactModel>(context,0,facts) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        val fact = getItem(position)

        if(view==null){
            view = LayoutInflater.from(parent.context).inflate(R.layout.custom_item,parent,false)
        }

        val logo = view?.findViewById<ImageView>(R.id.itemImage)
        val name = view?.findViewById<TextView>(R.id.itemName)
        val desc = view?.findViewById<TextView>(R.id.itemDesc)

        fact?.logo?.let{
            logo?.setImageResource(fact.logo)
        }
        name?.text = fact?.name
        desc?.text = fact?.fact

        return view!!
    }
}