package com.solar.hilt

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class HiltViewModel @Inject constructor() : ViewModel() {

    fun sample() = "text"
}