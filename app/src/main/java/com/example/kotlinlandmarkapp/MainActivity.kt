package com.example.kotlinlandmarkapp

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinlandmarkapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()


        val pisa = Landmark("Pisa","Italy",R.drawable.pisa)
        val colosseum = Landmark("Colosseum","Italy",R.drawable.colesium)
        val eiffel = Landmark("Eiffel", "France",R.drawable.eyfel_kulesi)
        val londonBridge = Landmark("London Bridge","United Kingdom",R.drawable.london_bridge)

        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)

        //Adapter : Layout & Data

        //RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter




        /* ListView
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landmark -> landmark.name })

        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->
            val intent = Intent(MainActivity@this,DetailsActivity::class.java)

            intent.putExtra("landmark",landmarkList.get(position))
            startActivity(intent)


        }
        */




    }





}