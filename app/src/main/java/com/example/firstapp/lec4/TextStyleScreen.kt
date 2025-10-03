package com.example.firstapp.lec4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun TextStyleScreen(modifier: Modifier = Modifier) {
    Scaffold {innerPadding ->
        Column(modifier = modifier.padding(
            innerPadding).fillMaxSize()
        )  {

        }
        Text(
            text = "Welcome to our app",
            color = Color.Red,
            textDecoration = TextDecoration.Underline,
            modifier = modifier.fillMaxSize(),
            textAlign = TextAlign.Center,
            fontSize= 20.sp,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Black,
                    blurRadius = 10f,
                    offset = Offset(-40f, 5f)
                ))


            )


    }
}

@Preview(showBackground = true)
@Composable
fun TextStyleScreenPreview() {
    TextStyleScreen()
}