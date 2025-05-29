package com.example.m07_p4

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class FoodListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_list)

        val foodList = listOf("Manzana", "Plátano", "Naranja") // Lista de alimentos de ejemplo
        val listView = findViewById<ListView>(R.id.lv_food_list)
        listView.adapter = FoodAdapter(this, foodList)
    }
}