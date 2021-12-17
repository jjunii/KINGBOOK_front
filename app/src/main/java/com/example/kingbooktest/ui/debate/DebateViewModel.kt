package com.example.kingbooktest.ui.debate

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DebateViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is debate Fragment"
    }
    val text: LiveData<String> = _text
}