package com.rezoo.state_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MyBox() {
    Box(modifier = Modifier
        .background(Color.Blue))

}