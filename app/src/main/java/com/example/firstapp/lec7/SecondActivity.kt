package com.example.firstapp.lec7

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.ui.theme.FirstappTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstappTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SecondScreen(
                        onBackClick = {
                            finish()
                        },
                        onShareClick = {
                            shareContent()
                        }
                    )
                }
            }
        }
    }
    
    private fun shareContent() {
        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            type = "text/plain"
            putExtra(Intent.EXTRA_SUBJECT, "Check this out!")
            putExtra(Intent.EXTRA_TEXT, "I'm sharing this from my Android app! 🚀")
        }
        startActivity(Intent.createChooser(shareIntent, "Share via"))
    }
}

@Composable
fun SecondScreen(onBackClick: () -> Unit, onShareClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Second Activity",
            fontSize = 28.sp,
            modifier = Modifier.padding(bottom = 32.dp)
        )
        
        Text(
            text = "You successfully navigated here!",
            fontSize = 18.sp,
            modifier = Modifier.padding(bottom = 32.dp)
        )
        
        Button(
            onClick = onShareClick,
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Share",
                fontSize = 16.sp
            )
        }
        
        Button(
            onClick = onBackClick,
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Go Back",
                fontSize = 16.sp
            )
        }
    }
}
