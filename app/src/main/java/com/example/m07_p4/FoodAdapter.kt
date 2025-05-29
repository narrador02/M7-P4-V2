package com.example.m07_p4

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.TextView

class FoodAdapter(private val context: Context, private val foodList: List<String>) : BaseAdapter() {

    override fun getCount(): Int = foodList.size

    override fun getItem(position: Int): Any = foodList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_food, parent, false)

        val foodName = view.findViewById<TextView>(R.id.tv_food_name)
        val editButton = view.findViewById<ImageButton>(R.id.btn_edit_food)

        foodName.text = foodList[position]

        editButton.setOnClickListener {
            val intent = Intent(context, EditFoodActivity::class.java)
            intent.putExtra("food_name", foodList[position])
            context.startActivity(intent)
        }

        return view
    }
}