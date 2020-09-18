package com.nonamer777.madlevel3task2.model

import android.app.PendingIntent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.nonamer777.madlevel3task2.R
import kotlinx.android.synthetic.main.item_portal.view.*

class PortalAdapter(private val portals: List<Portal>):
    RecyclerView.Adapter<PortalAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun dataBind(portal: Portal) {
            itemView.tvPortalName.text = portal.name
            itemView.tvPortalUrl.text = portal.url

            // Opens a Custom Chrome Tab with to link of the portal.
            itemView.setOnClickListener {
                val builder = CustomTabsIntent.Builder()

                // Sets the color of the header.
                builder.setToolbarColor(ContextCompat.getColor(it.context, R.color.colorPrimary))
                // Adds sharing options to the menu.
                builder.addDefaultShareMenuItem()
                // Shows the title op the page in the header.
                builder.setShowTitle(true)
                // Sets animations for entering and exiting the custom chrome tab.
                builder.setStartAnimations(it.context, android.R.anim.fade_in, android.R.anim.fade_out)
                builder.setExitAnimations(it.context, android.R.anim.fade_in, android.R.anim.fade_out)

                val customTabsIntent = builder.build()

                customTabsIntent.launchUrl(itemView.context, Uri.parse(portal.url))
            }
        }
    }


    /**
     * Creates and returns a ViewHolder object,
     * inflating a standard layout called `simple_list_item_1`
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_portal, parent, false)
    )

    /** Called by the RecyclerView to display the data at the specified position. */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.dataBind(portals[position])

    /** Returns the size of the list of portals. */
    override fun getItemCount(): Int = portals.size
}
