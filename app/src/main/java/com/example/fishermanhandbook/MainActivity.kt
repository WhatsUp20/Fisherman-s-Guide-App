package com.example.fishermanhandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nav_view.setNavigationItemSelectedListener(this)
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