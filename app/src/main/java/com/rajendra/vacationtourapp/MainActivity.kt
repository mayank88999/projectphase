package com.rajendra.vacationtourapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rajendra.vacationtourapp.adapter.RecentsAdapter
import com.rajendra.vacationtourapp.adapter.TopPlacesAdapter
import com.rajendra.vacationtourapp.model.RecentsData
import com.rajendra.vacationtourapp.model.TopPlacesData

class MainActivity : AppCompatActivity() {
    var recentRecycler: RecyclerView? = null
    var topPlacesRecycler: RecyclerView? = null
    var recentsAdapter: RecentsAdapter? = null
    var topPlacesAdapter: TopPlacesAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Now here we will add some dummy data in our model class
        val recentsDataList: MutableList<RecentsData> = ArrayList()
        recentsDataList.add(RecentsData("AM Lake", "India", "From $200", R.drawable.recentimage1))
        recentsDataList.add(
            RecentsData(
                "Nilgiri Hills",
                "India",
                "From $300",
                R.drawable.recentimage2
            )
        )
        recentsDataList.add(RecentsData("AM Lake", "India", "From $200", R.drawable.recentimage1))
        recentsDataList.add(
            RecentsData(
                "Nilgiri Hills",
                "India",
                "From $300",
                R.drawable.recentimage2
            )
        )
        recentsDataList.add(RecentsData("AM Lake", "India", "From $200", R.drawable.recentimage1))
        recentsDataList.add(
            RecentsData(
                "Nilgiri Hills",
                "India",
                "From $300",
                R.drawable.recentimage2
            )
        )
        setRecentRecycler(recentsDataList)
        val topPlacesDataList: MutableList<TopPlacesData> = ArrayList()
        topPlacesDataList.add(
            TopPlacesData(
                "Kasimir Hill",
                "India",
                "$200 - $500",
                R.drawable.topplaces
            )
        )
        topPlacesDataList.add(
            TopPlacesData(
                "Kasimir Hill",
                "India",
                "$200 - $500",
                R.drawable.topplaces
            )
        )
        topPlacesDataList.add(
            TopPlacesData(
                "Kasimir Hill",
                "India",
                "$200 - $500",
                R.drawable.topplaces
            )
        )
        topPlacesDataList.add(
            TopPlacesData(
                "Kasimir Hill",
                "India",
                "$200 - $500",
                R.drawable.topplaces
            )
        )
        topPlacesDataList.add(
            TopPlacesData(
                "Kasimir Hill",
                "India",
                "$200 - $500",
                R.drawable.topplaces
            )
        )
        setTopPlacesRecycler(topPlacesDataList)
    }

    private fun setRecentRecycler(recentsDataList: List<RecentsData>) {
        recentRecycler = findViewById(R.id.recent_recycler)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        with(recentRecycler) { this?.setLayoutManager(layoutManager) }
        recentsAdapter = RecentsAdapter(this, recentsDataList)
        with(recentRecycler) { this?.setAdapter(recentsAdapter) }
    }

    private fun setTopPlacesRecycler(topPlacesDataList: List<TopPlacesData>) {
        topPlacesRecycler = findViewById(R.id.top_places_recycler)
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        with(topPlacesRecycler) { this?.setLayoutManager(layoutManager) }
        topPlacesAdapter = TopPlacesAdapter(this, topPlacesDataList)
        with(topPlacesRecycler) { this?.setAdapter(topPlacesAdapter) }
    } // Hi all, today we are going to make a holiday tour app.
    // so lets see i will show you what we are going to build
    // so lets get started.
    // before getting started make sure to subscribe and hit the bell i con to get notified
    // everytime i post a video.
    // lets first import image assets
    // Now we will add a recycler view for recents data.
    // lets make a model class first.
    // now we create a adapter class for holding data
    // our adapter class is ready now we will setup recyclerview
    // So we have setup recents items recyclerview
    //Now we do same setup for top places
    // lets do it fast.
    // Now i will add a bottom navigation
    // now we will set the details activity
    // when user click on any of places details activity will open
    // So this app is done.
    // Please like share and subscribe
    // if any question plz do comment
    // Thanks for watching see you in the next tutorial
}