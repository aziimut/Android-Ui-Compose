package com.azimut.plantappverstca




import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex



@Composable
fun BodyHeader(
    modifier: Modifier = Modifier
){
    Box(
        modifier = modifier
            .height(200.dp)
            .background(colorResource(R.color.kBackgroundColor)),
    ) {
        val message = remember { mutableStateOf("")}
        OutlinedTextField(
            value = message.value,
            onValueChange = { message.value = it},
            modifier = modifier
                .fillMaxWidth()
                .padding(15.dp, 0.dp)
                .zIndex(1f)
                .offset(y = 105.dp)
                .shadow(
                    25.dp,
                    AbsoluteRoundedCornerShape(15)
                ),
            placeholder = { Text(text = "Search", style = TextStyle(
                color = colorResource(R.color.kTextHolder)
            ))},
            trailingIcon = { Icon(
                painter = painterResource(R.drawable.search),
                contentDescription = "Search")},
            maxLines = 2,
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = Color.White,
                focusedBorderColor = colorResource(R.color.kTextHolder),
                unfocusedBorderColor = colorResource(R.color.kTextHolder)
            )
        )
        Box(modifier = modifier
            .height(150.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(bottomEnd = 36.dp, bottomStart = 36.dp))
            .background(colorResource(R.color.kPrimaryColor))
        ) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(
                        dimensionResource(R.dimen.kDefaultPadding),
                        0.dp
                    ),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Hi Uishopy!", style = TextStyle(
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
                )
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "Logo",
                    contentScale = ContentScale.Crop,
                    modifier = modifier.size(80.dp)
                )
            }
        }
    }
}

