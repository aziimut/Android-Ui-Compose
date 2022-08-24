package com.azimut.plantappverstca

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BodyFeatured(modifier: Modifier = Modifier) {
    Column {
        Row(
            modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.kDefaultPadding), 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Featured Plants", modifier.clickable(onClick = {}),
                style = TextStyle(
                    textDecoration = TextDecoration.Underline,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.kTextColor)),
            )
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(colorResource(R.color.kPrimaryColor)),
                shape = RoundedCornerShape(20.dp)
            ){
                Text("More", fontSize = 15.sp, color = Color.White)
            }
        }
        Row(modifier.fillMaxWidth().horizontalScroll(ScrollState(0))) {
            Card(modifier.padding(dimensionResource(R.dimen.kDefaultPadding), 0.dp)) {
                Image(
                    painter = painterResource(R.drawable.bottom_img_1),
                    contentDescription = "item_1",
                    contentScale = ContentScale.Crop,
                    modifier = modifier.size(280.dp, 187.dp)
                )
            }
            Card(modifier.padding(dimensionResource(R.dimen.kDefaultPadding), 0.dp)) {
                Image(
                    painter = painterResource(R.drawable.bottom_img_2),
                    contentDescription = "item_1",
                    contentScale = ContentScale.Crop,
                    modifier = modifier.size(280.dp, 187.dp)
                )
            }
        }
    }
}