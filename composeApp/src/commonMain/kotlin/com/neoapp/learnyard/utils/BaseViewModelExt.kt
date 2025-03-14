package com.neoapp.learnyard.utils

import androidx.compose.runtime.Composable
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.neoapp.learnyard.presenter.ui.state.State
import com.neoapp.learnyard.presenter.ui.viewmodels.BaseViewModel

@Composable
fun <S : State, VM : BaseViewModel<S>> VM.collectState() = state.collectAsStateWithLifecycle()