package com.hellu.basiccleanarch.presentation

import androidx.lifecycle.ViewModel
import com.hellu.basiccleanarch.domain.GetMessageUseCase

class MainViewModel(private val getMessageUseCase: GetMessageUseCase) : ViewModel() {
    fun getMessage(name: String) = getMessageUseCase.run(name)
}