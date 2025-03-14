package com.neoapp.learnyard.presenter.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.neoapp.learnyard.presenter.component.NoLineTextField
import com.neoapp.learnyard.presenter.ui.viewmodels.LoginViewModel
import learnyard.composeapp.generated.resources.Res
import learnyard.composeapp.generated.resources.img_register
import learnyard.composeapp.generated.resources.refer_id_or_email_address
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun LoginScreen(
    viewModel: LoginViewModel = koinViewModel()
){

    val state by viewModel.coll

    Column(
        modifier = Modifier.fillMaxHeight()
    ) {
        Image(
            painter = painterResource(Res.drawable.img_register), contentDescription = "Register",
            modifier = Modifier
        )
        Text(text = stringResource(Res.string.refer_id_or_email_address),
            modifier = Modifier.padding(top = 16.dp),
            fontSize = 24.sp,)

        NoLineTextField(
            hints = "Enter your name",
            onValueChange = {  },
            value = "name",
            modifier = Modifier.padding(horizontal = 39.dp, vertical = 15.dp)
        )

    }
}