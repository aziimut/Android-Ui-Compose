package com.azimut.plantappverstca


import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp


@Composable
fun BottomNavigation(
    modifier: Modifier = Modifier
){
    BottomAppBar(
        backgroundColor = Color.White,
    ) {
        IconButton(
            onClick = {  },
            modifier.padding(start = 20.dp),
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.flower),
                contentDescription = "Меню")
        }
        Spacer(Modifier.weight(1f, true))

        IconButton(onClick = { }) {
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.heart_icon),
                contentDescription = "Информация о приложении",
                tint = Color.Gray
            )
        }
        Spacer(Modifier.weight(1f, true))
        IconButton(
            onClick = { },
            modifier.padding(end = 20.dp),
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.user_icon),
                contentDescription = "Избранное",
                tint = Color.Gray
            )

        }
    }

}