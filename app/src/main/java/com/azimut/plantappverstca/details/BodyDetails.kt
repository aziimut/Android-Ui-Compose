package com.azimut.plantappverstca.details

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.azimut.plantappverstca.MainActivity
import com.azimut.plantappverstca.R


@Preview(showSystemUi = true)
@Composable
fun BodyDetails(
    modifier: Modifier = Modifier
){
    val context = LocalContext.current
    Column(modifier.verticalScroll(ScrollState(0))) {
        Row(modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                IconButton(
                    onClick = { context.startActivity(Intent(context, MainActivity::class.java)) },
                    modifier.offset(x=15.dp,y=55.dp)
                ) {
                    Icon(painter = painterResource(R.drawable.back_arrow),
                        contentDescription = "",
                    )
                }
                Spacer(modifier.height(100.dp))
                IconButton(
                    onClick = { },
                    modifier
                        .offset(x = 15.dp, y = 55.dp)
                        .size(62.dp)
                        .background(colorResource(R.color.kBackgroundColor))
                        .shadow(5.dp, RoundedCornerShape(10.dp))
                ) {
                    Icon(painter = painterResource(R.drawable.sun),
                        contentDescription = "",
                        tint = colorResource(R.color.kPrimaryColor)
                    )
                }
                Spacer(modifier.height(50.dp))
                IconButton(
                    onClick = {},
                    modifier
                        .offset(x = 15.dp, y = 55.dp)
                        .size(62.dp)
                        .background(colorResource(R.color.kBackgroundColor))
                        .shadow(5.dp, RoundedCornerShape(10.dp))
                ) {
                    Icon(painter = painterResource(R.drawable.icon_2),
                        contentDescription = "",
                        tint = colorResource(R.color.kPrimaryColor)
                    )
                }
                Spacer(modifier.height(50.dp))
                IconButton(
                    onClick = { },
                    modifier
                        .offset(x = 15.dp, y = 55.dp)
                        .size(62.dp)
                        .background(colorResource(R.color.kBackgroundColor))
                        .shadow(5.dp, RoundedCornerShape(10.dp))
                ) {
                    Icon(painter = painterResource(R.drawable.icon_3),
                        contentDescription = "",
                        tint = colorResource(R.color.kPrimaryColor)
                    )
                }
                Spacer(modifier.height(50.dp))
                IconButton(
                    onClick = {  },
                    modifier
                        .offset(x = 15.dp, y = 55.dp)
                        .size(62.dp)
                        .background(colorResource(R.color.kBackgroundColor))
                        .shadow(5.dp, RoundedCornerShape(10.dp))
                ) {
                    Icon(painter = painterResource(R.drawable.icon_4),
                        contentDescription = "",
                        tint = colorResource(R.color.kPrimaryColor)
                    )
                }
            }
            Card(
                modifier.size(305.dp, 650.dp),
                elevation = 25.dp,
                shape = RoundedCornerShape(topStart = 50.dp, bottomStart = 50.dp)

            ){
                Image(
                    bitmap = ImageBitmap.imageResource(R.drawable.img),
                    contentDescription = "Image1",
                    alignment = Alignment.TopStart,
                    contentScale = ContentScale.FillHeight
                )
            }
        }
        Row(
            modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 40.dp, end = 20.dp, bottom = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(text = "Angelica",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.kTextColor)
                )
                Text(text = "Russia",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.kPrimaryColor)
                )
            }
            Text(text = "$440",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.kPrimaryColor)
            )
        }
        Row(modifier.fillMaxWidth().padding(bottom = 50.dp)) {
            Button(
                onClick = { },
                modifier
                    .weight(1f)
                    .wrapContentWidth(Alignment.Start),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor =  colorResource(R.color.kPrimaryColor),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(topEnd = 20.dp),
                contentPadding = PaddingValues(57.dp, 35.dp)
            ) {
                Text(text = "Buy Now",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            TextButton(
                onClick = { },
                modifier
                    .weight(1f)
                    .wrapContentWidth(Alignment.End),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor =  colorResource(R.color.kTransparent),
                    contentColor = colorResource(R.color.kTextColor)
                ),
                contentPadding = PaddingValues(40.dp, 35.dp)
            ) {
                Text(text = "Description",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}