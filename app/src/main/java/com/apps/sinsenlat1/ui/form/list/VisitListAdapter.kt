package com.apps.sinsenlat1.ui.form.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.apps.sinsenlat1.R
import com.apps.sinsenlat1.data.room.visit.Visit

class VisitListAdapter(val context: Context, val items: List<Visit>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return VisitViewHolder(LayoutInflater.from(context).inflate(R.layout.item_visit, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val holderItem = VisitViewHolder(holder.itemView)

        holderItem.location.text = items[position].location
        holderItem.date.text = items[position].date
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class VisitViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val location = view.findViewById<TextView>(R.id.location)
        val date = view.findViewById<TextView>(R.id.date)
    }
}