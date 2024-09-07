package com.kahawalove.mkahawademo.screens.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kahawalove.mkahawa.MkahawaTheme

@Preview(showBackground = true)
@Composable
fun MkahawaDemoMainScreen() {
    MkahawaTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()) { innerPadding ->
            KLLoremIpsumLine(
                lineText = "Welcome to Mkahawa Demo",
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}


@Composable
fun KLLoremIpsumLine(lineText: String, modifier: Modifier = Modifier) {
    Text(
        text = "$lineText!",
        modifier = modifier
    )
}
