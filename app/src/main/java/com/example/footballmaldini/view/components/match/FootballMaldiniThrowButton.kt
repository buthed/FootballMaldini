package com.example.footballmaldini.view.components.match

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.footballmaldini.R

@Composable
fun FootballMaldiniThrowButton(throwBall: () -> Unit) {
    Box(Modifier.fillMaxSize().padding(bottom = 55.dp, end = 50.dp), contentAlignment = Alignment.BottomEnd) {
        Image(painter = painterResource(id = R.drawable.ball01), contentDescription = "",
            Modifier.size(80.dp).clickable(onClick = throwBall))
    }
}