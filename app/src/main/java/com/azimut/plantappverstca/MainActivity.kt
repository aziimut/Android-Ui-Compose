package com.azimut.plantappverstca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Scaffold(
               backgroundColor = colorResource(R.color.kBackgroundColor),
               topBar = {
                   TopAppBar(
                       backgroundColor = colorResource(R.color.kPrimaryColor),
                       contentColor = colorResource(R.color.white),
                       elevation = 0.dp
                   ) {
                       IconButton(onClick = { /*TODO*/ }) {
                           Icon(
                               imageVector = ImageVector.vectorResource(R.drawable.menu),
                               contentDescription = "menu"
                           )
                       }
                   }
               },
               bottomBar = {
                   BottomNavigation()
               }
           ) {
               HomeScreen()
             }
        }
    }
}

