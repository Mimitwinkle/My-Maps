package io.mimitwinkle.mymaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.mimitwinkle.mymaps.R.id.rvMaps
import io.mimitwinkle.mymaps.models.UserMap

class MainActivity : AppCompatActivity() {
    private lateinit var rvMaps: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMaps = findViewById<RecyclerView>(R.id.rvMaps)

        // Set layout manager on the recycler view
        rvMaps.layoutManager = LinearLayoutManager(this)
        // Set adapter on the recycler view
        rvMaps.adapter = MapsAdapter(this, emptyList<UserMap>())

    }
}