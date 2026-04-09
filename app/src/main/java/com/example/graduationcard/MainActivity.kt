package com.example.graduationcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.graduationcard.ui.theme.GraduationCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GraduationCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingText(
                        message = "Happy Graduation Adhyan",
                        sender = "From Andin",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, sender: String, modifier: Modifier = Modifier) {
    Column  (verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(8.dp).fillMaxSize()
    ){
        Text(
            text = message,
            fontSize = 75.sp,
            lineHeight = 110.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = sender,
            fontSize = 28.sp,
            modifier = Modifier.padding( all = 16.dp).align(Alignment.End)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GraduationCardTheme {
        GreetingText( message = "Happy Graduation Adhyan ", sender = "From Andin")
    }
}