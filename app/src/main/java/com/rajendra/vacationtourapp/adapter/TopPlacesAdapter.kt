package com.rajendra.vacationtourapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.rajendra.vacationtourapp.R
import com.rajendra.vacationtourapp.adapter.TopPlacesAdapter.TopPlacesViewHolder
import com.rajendra.vacationtourapp.model.TopPlacesData

class TopPlacesAdapter(var context: Context, var topPlacesDataList: List<TopPlacesData>) :
    RecyclerView.Adapter<TopPlacesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopPlacesViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.top_places_row_item, parent, false)

        // here we create a recyclerview row item layout file
        return TopPlacesViewHolder(view)
    }

    override fun onBindViewHolder(holder: TopPlacesViewHolder, position: Int) {
        holder.countryName.text = topPlacesDataList[position].countryName
        holder.placeName.text = topPlacesDataList[position].placeName
        holder.price.text = topPlacesDataList[position].price
        holder.placeImage.setImageResource(topPlacesDataList[position].imageUrl)
    }

    override fun getItemCount(): Int {
        return topPlacesDataList.size
    }

    class TopPlacesViewHolder(itemView: View) : ViewHolder(itemView) {
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