package com.nonamer777.madlevel3task2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.nonamer777.madlevel3task2.R
import kotlinx.android.synthetic.main.fragment_add_portal.*

const val ARG_PORTAL_NAME = "portal_name"
const val ARG_PORTAL_URL = "portal_url"

/** A simple [Fragment] subclass to add portals to the overview of portals. */
class AddPortalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_portal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnAddPortal.setOnClickListener {
            onAddPortal()
        }
    }

    private fun onAddPortal() {
        val portalName = inputPortalName.text.toString()
        val portalUrl = inputPortalUrl.text.toString()
        val args = Bundle()

        if (portalName.isNotBlank() && portalUrl.isNotBlank()) {
            args.putString(ARG_PORTAL_NAME, portalName)
            args.putString(ARG_PORTAL_URL, portalUrl)

            findNavController()
                .navigate(R.id.action_addPortalFragment_to_portalOverviewFragment, args)
        } else {
            Toast.makeText(
                activity,
                R.string.not_valid_portal, Toast.LENGTH_SHORT
            ).show()
        }
    }
}
