package com.lee.mymvvmsample.ui.main.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.lee.mymvvmsample.network.NetworkRepository
import com.lee.mymvvmsample.common.BaseViewModel

class HomeViewModel(private val repository: NetworkRepository) : BaseViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}