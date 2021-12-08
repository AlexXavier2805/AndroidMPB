package com.example.proyectompdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.proyectompdb.fragments.CursoFragment
import com.example.proyectompdb.fragments.MenuFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        openFragment(MenuFragment())

        val bottomNav: BottomNavigationView = findViewById(R.id.bnvMenu)
        bottomNav.setOnNavigationItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.nav_menu ->{
                    val fragment = MenuFragment()
                    openFragment(fragment)
                    true
                }
                R.id.nav_courses ->{
                    val fragment = CursoFragment()
                    openFragment(fragment)
                    true
                }
                else -> false
            }
        }
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.flContenedor, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}