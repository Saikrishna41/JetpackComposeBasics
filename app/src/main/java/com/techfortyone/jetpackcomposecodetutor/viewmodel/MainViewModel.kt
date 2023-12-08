package com.techfortyone.jetpackcomposecodetutor.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val counter = MutableLiveData<Int>(0)


    var incrementCounter = {
        counter.value = counter.value?.plus(1)
    }

    var decrementCounter = {
        counter.value = counter.value?.minus(1)
    }

}