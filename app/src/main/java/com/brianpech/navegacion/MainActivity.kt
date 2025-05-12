package com.brianpech.navegacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.brianpech.navegacion.navegation.NavManager
import com.brianpech.navegacion.views.DetailView
import com.brianpech.navegacion.views.HomeView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           NavManager()
        }
    }
}
