package com.nonamer777.madlevel3task2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nonamer777.madlevel3task2.model.Portal
import com.nonamer777.madlevel3task2.model.PortalAdapter
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
    }

    /** Initializes the view, connects the Portal Adapter to the RecyclerView. */
    private fun initViews() {
        rvPortals.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        rvPortals.adapter = portalAdapter
    }
}
