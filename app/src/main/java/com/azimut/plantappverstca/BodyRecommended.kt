package com.azimut.plantappverstca

import android.content.Intent
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.azimut.plantappverstca.details.DetailsActivity

@Composable
fun BodyRecommended(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Column {
        Row(
            modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.kDefaultPadding), 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Recommended", modifier.clickable(onClick = {}),
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
        Row(
            modifier
                .fillMaxWidth()
                .horizontalScroll(ScrollState(0))) {
            Card(
                modifier.padding(dimensionResource(R.dimen.kDefaultPadding), 0.dp)
                        .clickable(onClick = {
                        context.startActivity(Intent(context, DetailsActivity::class.java))
                    })
            ) {
                Column(modifier.size(160.dp, 230.dp)) {
                    Image(
                        painter = painterResource(R.drawable.image_1),
                        contentDescription = "item_1",
                        modifier = modifier.size(160.dp, 190.dp)
                    )
                    Row(
                        modifier
                            .fillMaxWidth()
                            .padding(5.dp, 0.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text("SAMANTHA",
                                fontWeight = FontWeight.Bold,
                                color = colorResource(R.color.kTextColor)
                            )
                            Text("RUSSIA",
                                fontWeight = FontWeight.Bold,
                                color = colorResource(R.color.kPrimaryColorOpa),
                            )
                        }
                        Text("$440",
                            fontWeight = FontWeight.Bold,
                            color = colorResource(R.color.kPrimaryColorOpa))
                    }
                }
            }
            Card(
                modifier
                    .padding(dimensionResource(R.dimen.kDefaultPadding), 0.dp)
                    .clickable(onClick = {
                        context.startActivity(Intent(context, DetailsActivity::class.java))
                    })
            ) {
                Column(modifier.size(160.dp, 230.dp)) {
                    Image(
                        painter = painterResource(R.drawable.image_2),
                        contentDescription = "item_1",
                        modifier = modifier.size(160.dp, 190.dp)
                    )
                    Row(
                        modifier
                            .fillMaxWidth()
                            .padding(5.dp, 0.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text("ANGELICA",
                                fontWeight = FontWeight.Bold,
                                color = colorResource(R.color.kTextColor)
                            )
                            Text("RUSSIA",
                                fontWeight = FontWeight.Bold,
                                color = colorResource(R.color.kPrimaryColorOpa),
                            )
                        }
                        Text("$440",
                            fontWeight = FontWeight.Bold,
                            color = colorResource(R.color.kPrimaryColorOpa))
                    }
                }
            }
            Card(
                modifier
                    .padding(dimensionResource(R.dimen.kDefaultPadding), 0.dp)
                    .clickable(onClick = {
                        context.startActivity(Intent(context, DetailsActivity::class.java))
                    })
            ) {
                Column(modifier.size(160.dp, 230.dp)) {
                    Image(
                        painter = painterResource(R.drawable.image_3),
                        contentDescription = "item_1",
                        modifier = modifier.size(160.dp, 190.dp)
                    )
                    Row(
                        modifier
                            .fillMaxWidth()
                            .padding(5.dp, 0.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text("SAMANTHA",
                                fontWeight = FontWeight.Bold,
                                color = colorResource(R.color.kTextColor)
                            )
                            Text("RUSSIA",
                                fontWeight = FontWeight.Bold,
                                color = colorResource(R.color.kPrimaryColorOpa),
                            )
                        }
                        Text("$440",
                            fontWeight = FontWeight.Bold,
                            color = colorResource(R.color.kPrimaryColorOpa))
                    }
                }
            }
        }
    }
}