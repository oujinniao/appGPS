package com.example.vehiclegpsmonitor


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.DataBindingUtil.setContentView
import com.example.vehiclegpsmonitor.R
import com.google.android.gms.maps.MapView

class MapActivity : AppCompatActivity() {

    private lateinit var mapView: MapView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        mapView = findViewById(R.id.mapView)
        mapView.onCreate(savedInstanceState)

        // Configurar el botón de historial
        findViewById<Button>(R.id.btn_view_history).setOnClickListener {
            // Navegar a la pantalla de historial
            startActivity(Intent(this, HistoryActivity::class.java))
        }

        // Configurar el botón de notificaciones
        findViewById<Button>(R.id.btn_toggle_notifications).setOnClickListener {
            // Activar/desactivar notificaciones
            toggleNotifications()
        }
    }

    private fun toggleNotifications() {
        // Implementar la lógica para activar o desactivar notificaciones
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }
}
