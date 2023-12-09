package com.techfortyone.jetpackcomposecodetutor.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val counter = MutableLiveData<Int>(0)

    val error = MutableLiveData<String>()


    var incrementCounter = {
        counter.value = counter.value?.plus(1)
    }

    var decrementCounter = {
        if (counter.value!! <= 0) {
            if (error.value == null) {
                error.value = "Counter cannot be less than 0"
            }
        }
        else {
            counter.value = counter.value?.minus(1)
        }
    }

}