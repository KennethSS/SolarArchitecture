package com.solar.architecture.mvvm.viewmodel

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MvvmViewModel @Inject constructor() : ViewModel() {
    fun getSample() = "mvvmViewModel"
}