package com.example.checkpoint1


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.checkpoint1.ui.theme.Checkpoint1Theme
import com.example.checkpoint1.ui.theme.ScaffoldLayout //import scaffold from other file


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Checkpoint1Theme {

                Surface(//not as important for this project
                    modifier = Modifier.fillMaxSize()
                ) {
                    ScaffoldLayout()
                }
            }
        }
    }
}



