package com.solar.architecture

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap

abstract class LiveViewModel<T>(
    private val repository: LiveRepository<T>
) : ViewModel() {

    private val _liveData: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    val liveData: LiveData<T> = _liveData.switchMap {
        repository.getDataWithId(it)
    }

    fun getDataFromId(id: Int) {
        _liveData.postValue(id)
    }

    interface LiveRepository<T> {
        fun getDataWithId(id: Int): LiveData<T>
    }
}