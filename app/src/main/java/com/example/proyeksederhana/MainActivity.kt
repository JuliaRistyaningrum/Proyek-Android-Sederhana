package com.example.proyeksederhana

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyeksederhana.ui.theme.ProyekSederhanaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyekSederhanaTheme {
                MyScreen()
            }
        }
    }
}

@Composable
fun MyScreen() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            Toast.makeText(context, "Selamat datang di Android", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Ganti")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyScreen() {
    ProyekSederhanaTheme {
        MyScreen()
    }
}
