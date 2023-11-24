package com.rajendra.vacationtourapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.rajendra.vacationtourapp.DetailsActivity
import com.rajendra.vacationtourapp.R
import com.rajendra.vacationtourapp.adapter.RecentsAdapter.RecentsViewHolder
import com.rajendra.vacationtourapp.model.RecentsData

class RecentsAdapter(var context: Context, var recentsDataList: List<RecentsData>) :
    RecyclerView.Adapter<RecentsViewHolder?>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentsViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recents_row_item, parent, false)

        // here we create a recyclerview row item layout file
        return RecentsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecentsViewHolder, position: Int) {
        holder.countryName.text = recentsDataList[position].countryName
        holder.placeName.text = recentsDataList[position].placeName
        holder.price.text = recentsDataList[position].price
        holder.placeImage.setImageResource(recentsDataList[position].imageUrl)
        holder.itemView.setOnClickListener {
            val i = Intent(context, DetailsActivity::class.java)
            context.startActivity(i)
        }
    }

    override fun getItemCount(): Int {
        return recentsDataList.size
    }

    class RecentsViewHolder(itemView: View) : ViewHolder(itemView) {
        var placeImage: ImageView
        var placeName: TextView
        var countryName: TextView
        var price: TextView

        init {
            placeImage = itemView.findViewById(R.id.place_image)
            placeName = itemView.findViewById(R.id.place_name)
            countryName = itemView.findViewById(R.id.country_name)
            price = itemView.findViewById(R.id.price)
        }
    }
}