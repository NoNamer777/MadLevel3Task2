package com.nonamer777.madlevel3task2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nonamer777.madlevel3task2.model.Portal
import com.nonamer777.madlevel3task2.model.PortalAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_portal_overview.*

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    companion object {
        val portals = arrayListOf<Portal>()
        val portalAdapter = PortalAdapter(portals)
    }

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
