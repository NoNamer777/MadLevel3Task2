package com.nonamer777.madlevel3task2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.nonamer777.madlevel3task2.MainActivity
import com.nonamer777.madlevel3task2.R
import com.nonamer777.madlevel3task2.model.Portal
import kotlinx.android.synthetic.main.fragment_portal_overview.*

/** A simple [Fragment] subclass that holds the overview of portals. */
class PortalOverviewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_portal_overview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()

        // Add Portal to the list of portals if they're present in the arguments
        val portalName = arguments?.getString(ARG_PORTAL_NAME)
        val portalUrl = arguments?.getString(ARG_PORTAL_URL)

        if (portalName != null && portalUrl != null) {
            val portal = Portal(portalName, portalUrl)

            MainActivity.portals.add(portal)
            MainActivity.portalAdapter.notifyDataSetChanged()
        }
    }

    /** Initializes the view, connects the Portal Adapter to the RecyclerView. */
    private fun initViews() {
        rvPortals.layoutManager = GridLayoutManager(
            context,
            2,
            GridLayoutManager.VERTICAL,
            false
        )

        rvPortals.adapter = MainActivity.portalAdapter
    }
}
