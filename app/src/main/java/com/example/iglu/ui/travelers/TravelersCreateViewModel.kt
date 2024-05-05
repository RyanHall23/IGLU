package com.example.iglu.ui.travelers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TravelersCreateViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is create travelers Fragment"
    }
    val text: LiveData<String> = _text
}