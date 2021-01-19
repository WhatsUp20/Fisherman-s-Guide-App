package com.example.fishermanhandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_content.*
import kotlinx.android.synthetic.main.main_content.view.*

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nav_view.setNavigationItemSelectedListener(this)

        var list = ArrayList<ListItem>()

        list.add(ListItem(R.drawable.som,"Som","This is a Som!"))
        list.add(ListItem(R.drawable.nalim,"Nalim","This is a Nalim!"))
        list.add(ListItem(R.drawable.shuca,"Shuca","This is a Shuca!"))
        rcView.hasFixedSize()
        rcView.layoutManager = LinearLayoutManager(this)
        rcView.adapter = MyAdapter(list, this)

    }



    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.id_fish -> Toast.makeText(this, "id_fish", Toast.LENGTH_SHORT).show()
            R.id.id_na -> Toast.makeText(this, "id_nu", Toast.LENGTH_SHORT).show()
            R.id.id_snu -> Toast.makeText(this, "id_snu", Toast.LENGTH_SHORT).show()
            R.id.id_history -> Toast.makeText(this, "id_history", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}