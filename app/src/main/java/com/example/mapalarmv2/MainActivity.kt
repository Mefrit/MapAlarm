package com.example.mapalarmv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity() {
    lateinit var mapFragment : SupportMapFragment
    lateinit var googleMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mapFragment = supportFragmentManager.findFragmentById(R.id.map)as SupportMapFragment
        mapFragment.getMapAsync(OnMapReadyCallback {
            googleMap = it
//            val location = LatLng(12.03,77.23)
//            googleMap.addMarker(MarkerOptions().position(location).title("Another location"))
//            googleMap.animateCamera(CameraUpdateFactory.newLatLng(location))
//            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location,15f))
        })
    }
}