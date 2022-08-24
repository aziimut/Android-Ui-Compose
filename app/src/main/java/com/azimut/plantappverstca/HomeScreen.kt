package com.azimut.plantappverstca

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
){
    Column(
        modifier
            .fillMaxSize()
            .verticalScroll(ScrollState(0))
            .padding(bottom = 70.dp)
    ) {
        BodyHeader()
        BodyRecommended()
        BodyFeatured()
    }
}