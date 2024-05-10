package com.example.checkpoint1.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomAppBar
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign


@Composable
fun ScaffoldLayout() {
    Scaffold(

        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Top App Bar")
                },

                backgroundColor = MaterialTheme.colors.primary


            )
        },

        content = {values ->
            Column(Modifier.padding(values)) {

                Text(
                    text = "Content of the page",
                    //fontSize = 30.sp //changing default from theme

                )
            }
        },

        bottomBar = {
            BottomAppBar(
                backgroundColor = MaterialTheme.colors.primary,
                contentColor = MaterialTheme.colors.onPrimary, //using from theme or default material
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "Bottom App Bar",
                )
            }
        },

        floatingActionButton = {
            FloatingActionButton(onClick = {/* TODO -> Navigation */}) {
                Icon(
                    Icons.Default.Favorite,
                    contentDescription = "Add")
            }
        }
    )
}