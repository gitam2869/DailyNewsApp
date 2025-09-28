package com.kmm.apps.dailynewsapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AboutDeviceScreen() {
    Column {
        Toolbar()
        ContentView()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Toolbar() {
    TopAppBar(
        title = {
            Text(
                text = "About Device"
            )
        }
    )
}

@Composable
private fun ContentView() {
    val items = getSystemInfoList()

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(items) {
            SystemInfoItem(
                title = it.first,
                subTitle = it.second
            )
        }
    }
}

private fun getSystemInfoList(): List<Pair<String, String>> {
    val platform = Platform()

    return listOf(
        Pair("Operating System", platform.osName),
        Pair("Device", platform.deviceModel),
        Pair("Density", platform.density.toString())
    )
}

@Composable
private fun SystemInfoItem(
    title: String,
    subTitle: String
) {
    Column(Modifier.padding(8.dp)) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodySmall,
            color = Color.Gray
        )
        Text(
            text = subTitle,
            style = MaterialTheme.typography.bodyLarge
        )
    }
    HorizontalDivider()
}
