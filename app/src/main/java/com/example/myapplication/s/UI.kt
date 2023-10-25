package com.example.myapplication.s

import android.app.LauncherActivity.ListItem
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import data.WeatherModel


@Composable
fun ListItem(item: WeatherModel) {

    Card(
        modifier = Modifier
        .fillMaxWidth()
        .padding(top = 3.dp)
        .background(Color.Black),
        //elevation = 0.dp,
        shape = RoundedCornerShape(5.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.padding(
                    start = 8.dp,
                    top = 5.dp,
                    bottom = 5.dp
                    )
                ) {
                    Text(
                        text = item.time,
                        color = Color.White
                        )
                    Text(
                        text = item.condition,
                        color = Color.White
                    )
                }
                Text(
                    text = item.currentTemp.ifEmpty { "${item.maxTemp}/${item.minTemp}" },
                    color = Color.White,
                    style = TextStyle(fontSize = 25.sp)
                    )
                    AsyncImage(
                        model = "https:${item.icon}",
                        contentDescription = "im5",
                        modifier = Modifier
                            .size(35.dp)
                            .padding(end = 8.dp)
                    )
            }
    }


}