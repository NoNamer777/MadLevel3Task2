package com.nonamer777.madlevel3task2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/** A simple [Fragment] subclass that holds the overview of portals. */
class PortalOverviewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_portal_overview, container, false)
    }
}
