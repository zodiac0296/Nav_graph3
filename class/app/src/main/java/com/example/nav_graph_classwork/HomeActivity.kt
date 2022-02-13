package com.example.nav_graph_classwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nav_graph_classwork.fragments.FirstFragment
import com.example.nav_graph_classwork.fragments.SecondFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottomNav = findViewById(R.id.bottomNav)

        bottomNav.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id. firstFragment-> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragContHome, FirstFragment()).commit()
                }

                R.id.secondFragment -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragContHome, SecondFragment()).commit()

                }

            }
            true
        }

    }
}