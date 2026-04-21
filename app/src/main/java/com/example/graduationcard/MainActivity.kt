package com.example.graduationcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.graduationcard.ui.theme.GraduationCardTheme
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GraduationCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingImage(
                        message = "Happy Graduation Adhyan",
                        from = "From Andin",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.kartu_ucapan)
    Box(modifier){
        Image(
            painter = image,
            contentDescription = null,
            alpha = 1F,
            modifier = modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        GreetingText(
            message = message,
            sender = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}
@Composable
fun GreetingText(
    message: String,
    sender: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {

        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = message,
                fontSize = 75.sp,
                textAlign = TextAlign.Center,
                lineHeight = 110.sp,
                color = Color.Black,
                fontStyle = FontStyle.Italic
            )
        }

        Text(
            text = sender,
            fontSize = 28.sp,
            color = Color.Black,
            fontStyle = FontStyle.Italic,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GraduationCardTheme {
        GreetingImage( message = "Happy Graduation Adhyan ", "From Andin")
    }
}

