package com.example.firstapp.lec4

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun BoxShareScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        Column(
            modifier = modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .border(
                        16.dp, Color.Red, shape = CircleShape
                    )
                    .size(100.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "box",
                    textAlign = TextAlign.Center
                )
            }
            Box(
                modifier = Modifier
                    .border(
                        16.dp, Color.Red, shape = RoundedCornerShape(size = 200.dp)
                    )
                    .size(100.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "box",
                    textAlign = TextAlign.Center
                )
            }
            Box(
                modifier = Modifier
                    .border(
                        16.dp, Color.Red, shape = CutCornerShape(size = 200.dp)
                    )
                    .size(500.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "box",
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BoxShareScreenPreview() {
    BoxShareScreen()

}