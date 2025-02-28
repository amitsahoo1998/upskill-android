package com.neoapp.learnyard.presenter.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import learnyard.composeapp.generated.resources.Res
import learnyard.composeapp.generated.resources.lato_bold

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
            style = typography.subtitle1,
            color = Color.White,
            fontFamily = latoFontFamily
        )
    }
}
private val latoFontFamily = FontFamily(
    fonts = listOf(
        Font(
            resId = Res.font.lato_bold,
            weight = FontWeight.W900,
            style = FontStyle.Normal
        )
    )
)