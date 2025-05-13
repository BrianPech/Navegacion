package com.brianpech.navegacion.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.brianpech.navegacion.components.MainButton
import com.brianpech.navegacion.components.Space
import com.brianpech.navegacion.components.TitleBar
import com.brianpech.navegacion.components.TitleView

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ThirdView(
    navController: NavController
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { TitleBar(name = "Third View") },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.Blue
                )
            )
        }) {
        ContentThirdView(navController)
    }
}

@Composable
fun ContentThirdView(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleView(name = "Third View")
        Space()
        MainButton(name = "Return Detail ", backColor = Color.Blue, color = Color.White) {
            navController.navigate("Detail")
        }
    }
}