package com.brianpech.navegacion.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.brianpech.navegacion.views.DetailView
import com.brianpech.navegacion.views.HomeView


@Composable
fun NavManager() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home") {
        composable("Home") {
            HomeView(navController)
        }
        composable("Detail") {
            DetailView(navController)
        }
    }
}