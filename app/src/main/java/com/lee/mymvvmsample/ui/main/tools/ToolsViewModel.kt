package com.lee.mymvvmsample.ui.main.tools

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.lee.mymvvmsample.network.SampleRepository
import com.lee.mymvvmsample.common.BaseViewModel

class ToolsViewModel(private val repository: SampleRepository) : BaseViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is tools Fragment"
    }
    val text: LiveData<String> = _text
}