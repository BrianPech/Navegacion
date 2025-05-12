package com.brianpech.navegacion.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.brianpech.navegacion.components.ActionButton
import com.brianpech.navegacion.components.MainButton
import com.brianpech.navegacion.components.Space
import com.brianpech.navegacion.components.TitleBar
import com.brianpech.navegacion.components.TitleView

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView(
    navController: NavController
) {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(
            title = {
                TitleBar(name = "Home View")
            }, colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = Color.Blue
            )
        )
    }, floatingActionButton = {
        ActionButton()
    }

    ) {
        ContentHomeView(navController)
    }
}

@Composable
fun ContentHomeView(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleView(name = "Home View")
        Space()
        MainButton(name = "Detail View", backColor = Color.Blue, color = Color.White) {
           navController.navigate("Detail")
        }
    }
}