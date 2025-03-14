package com.neoapp.learnyard.presenter.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.neoapp.learnyard.presenter.component.AppFullWidthButton
import learnyard.composeapp.generated.resources.Res
import learnyard.composeapp.generated.resources.caption
import learnyard.composeapp.generated.resources.earth_light
import learnyard.composeapp.generated.resources.logo_name
import org.jetbrains.compose.resources.painterResource

@Composable
fun SplashScreen(
    navigateToLogin: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxHeight()
    ) {
        Column {
            Image(
                painter = painterResource(
                    Res.drawable.logo_name
                ),
                contentDescription = "Logo",
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(fraction = 0.6f).wrapContentHeight()
            )
            Image(
                painter = painterResource(Res.drawable.earth_light), contentDescription = "Globe",
                modifier = Modifier
                    .padding(16.dp)
            )
            Image(
                painter = painterResource(Res.drawable.caption), contentDescription = "Caption",
                modifier = Modifier
                    .size(250.dp, 110.dp)
            )
        }

        AppFullWidthButton(
            text = "Let’s start",
            enabled = true,
            onClick = navigateToLogin,
            modifier = Modifier.padding(vertical = 30.dp, horizontal = 16.dp)
                .clip(RoundedCornerShape(10.dp))
        )
    }
}