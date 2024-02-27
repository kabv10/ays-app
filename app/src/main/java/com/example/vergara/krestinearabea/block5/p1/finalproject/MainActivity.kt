package com.example.vergara.krestinearabea.block5.p1.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import ui.DashboardFragment
import ui.HomeFragment
import ui.SettingFragment
import ui.Profile


private val View.itemId: Any
    get() {
        TODO("Not yet implemented")
    }
private val Int.Fragment: Any
    get() {
        TODO("Not yet implemented")
    }

class MainActivity : AppCompatActivity() {
    private lateinit var navview: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        navview = findViewById(R.id.nav_view)

        replace(HomeFragment)

        navview.setOnClickListener {
            when(it.itemId) {
                R.id.navigation_home -> replace { HomeFragment() }
                R.id.navigation_dashboard -> replace { DashboardFragment() }
                R.id.navigation_settings -> replace { SettingFragment() }
                R.id.account-> replace { Profile() }
            }

            true
        }

    }

    private fun replace(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace (R.id.navhost.Fragment)
        fragmentTransaction.commit()


    }

}

private fun <FragmentTransaction> FragmentTransaction.replace(fragment: Any) {

}



