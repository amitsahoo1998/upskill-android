package com.neoapp.learnyard.presenter.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AppFullWidthButton(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean,
    color: Color = MaterialTheme.colors.primary,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(60.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = color),
        enabled = enabled
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.body1.copy(
                color = MaterialTheme.colors.primary
            ),
            color = Color.White
        )
    }
}