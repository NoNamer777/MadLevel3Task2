package com.nonamer777.madlevel3task2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        navController = findNavController(R.id.nav_host_fragment)

        // Listen to button clicks on the Floating Action Button.
        fab.setOnClickListener {
            navController.navigate(R.id.action_portalOverviewFragment_to_addPortalFragment)
        }

        toggleFab()
    }

    /** Hides the Floating Action Button when the user navigates towards the Add Portals Fragment. */
    private fun toggleFab() = navController.addOnDestinationChangedListener { _, destination, _ ->

        if (destination.id in arrayOf(R.id.addPortalFragment)) fab.hide()
        else fab.show()
    }
}
