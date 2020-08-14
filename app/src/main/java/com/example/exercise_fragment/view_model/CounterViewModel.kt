package com.example.exercise_fragment.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    val counter: MutableLiveData<Int> = MutableLiveData(0)

    fun increase() {
        counter.value = counter.value?.plus(1)
    }

    fun decrease() {
        counter.value = counter.value?.minus(1)
    }
}