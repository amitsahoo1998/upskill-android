package com.neoapp.learnyard.presenter.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.neoapp.neocarsindia.R
import com.neoapp.neocarsindia.component.button.AppFullWidthButton
import com.neoapp.neocarsindia.component.dialog.FailureDialog
import com.neoapp.neocarsindia.component.dialog.LoaderDialog
import com.neoapp.neocarsindia.component.text.MobileTextField
import com.neoapp.neocarsindia.utils.CarPreview

@Composable
fun LoginPage(
    isLoading: Boolean,
    mobile: String,
    isValidMobile: Boolean,
    onLoginClick: () -> Unit,
    onSkipClick: () -> Unit,
    onPhoneNumberChange: (String) -> Unit,
    onDialogDismiss: () -> Unit,
    success: String?,
    error: String?,
    isSnackBarVisible: Boolean,
    snackBarDismiss: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.surface)
            .verticalScroll(rememberScrollState())
    ) {
        TopGreeting()

        LoginForm(
            mobile = mobile,
            isValidMobile = isValidMobile,
            onLoginClick = onLoginClick,
            onSkipClick = onSkipClick,
            onPhoneNumberChange = onPhoneNumberChange
        )
    }
}

@Composable
fun TopGreeting() {
    Column(Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(
                id = R.drawable.login_drawable
            ),
            contentDescription = "Login Drawable",
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.FillBounds
        )

        Text(
            text = "Enter your phone number",
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 30.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = "We will send a code (via SMS text message) to your mobile number",
            minLines = 2,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(start = 60.dp, end = 60.dp, bottom = 30.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun LoginForm(
    mobile: String,
    isValidMobile: Boolean,
    onLoginClick: () -> Unit,
    onSkipClick: () -> Unit,
    onPhoneNumberChange: (String) -> Unit,
) {
    Column(verticalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxHeight()) {

        MobileTextField(
            modifier = Modifier.padding(horizontal = 39.dp),
            value = mobile,
            onValueChange = onPhoneNumberChange,
            isError = false
        )
        AppFullWidthButton(
            text = "Send OTP",
            enabled = isValidMobile,
            onClick = onLoginClick,
            modifier = Modifier.padding(vertical = 30.dp, horizontal = 39.dp)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(7.dp)
                .align(Alignment.End)
        ) {
            Text(
                text = "Privacy Policy",
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(end = 30.dp)
                    .align(Alignment.BottomEnd)
                    .clickable { onSkipClick.invoke() }
            )
        }
    }
}