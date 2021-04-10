package com.example.dagger_hilt.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.assisted.Assisted
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class MyViewModel @Inject constructor(
     @Named("StringMain")  mainString:  String
) :ViewModel() {

    var value=""
    init {
        Log.d("ViewModel", "Main String: $mainString ")

        value= mainString
    }

    fun show():String{
        return value
    }
}