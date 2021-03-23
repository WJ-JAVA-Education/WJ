package com.example.googlemaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.google.android.gms.maps.*

import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {
    lateinit var gMap : GoogleMap
    lateinit var mapFrag : MapFragment

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val busanIT = LatLng(35.15607819788899, 129.05956300488538)
        mMap.mapType = GoogleMap.MAP_TYPE_SATELLITE
        mMap.addMarker(MarkerOptions().position(busanIT).title("부산 IT 교육센터"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(busanIT,15f))
    }

}