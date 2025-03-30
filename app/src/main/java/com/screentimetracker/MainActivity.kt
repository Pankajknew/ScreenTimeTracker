package com.screentimetracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScreenTimeApp()
        }
    }
}

@Composable
fun ScreenTimeApp() {
    Text("Screen Time Tracker is working!")
}

@Preview
@Composable
fun PreviewApp() {
    ScreenTimeApp()
}
