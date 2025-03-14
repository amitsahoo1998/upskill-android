package com.neoapp.learnyard.presenter.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import learnyard.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.painterResource

@Composable
fun MobileTextField(
    modifier: Modifier = Modifier,
    isError: Boolean = false,
    value: String = "",
    onValueChange: (String) -> Unit
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        TextField(
            value = value,
            onValueChange = onValueChange,
            isError = isError,
            leadingIcon = {
                /*Image(
                    painter = painterResource(id = Res.drawable.india_flag_icon),
                    contentDescription = ""
                )*/
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                textColor = MaterialTheme.colors.onBackground,
                disabledTextColor = Color.Transparent,
                backgroundColor = Color(0xFAF0F4F7),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            )
        )
    }
}

@Composable
fun NoLineTextField(
    modifier: Modifier = Modifier,
    isError: Boolean = false,
    hints : String,
    trailingIcon: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    value: String = "",
    enabled: Boolean = true,
    onValueChange: (String) -> Unit
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        TextField(
            value = value,
            onValueChange = onValueChange,
            isError = isError,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled,
            trailingIcon = trailingIcon,
            leadingIcon = leadingIcon,
            colors = TextFieldDefaults.textFieldColors(
                textColor = MaterialTheme.colors.onBackground,
                disabledTextColor = Color.Transparent,
                backgroundColor = Color(0xFAF0F4F7),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            placeholder = { Text(text = hints , color = Color(0xFFADADAD)) },
        )
    }

}
