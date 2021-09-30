package com.example.livedatademo.viewmodelpackage

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

     val factsLiveData = MutableLiveData("This is a fact")
//
//    val factsLiveData: LiveData<String>
//        get() = factsLiveDataObject
//

    fun updateLiveData() {
        factsLiveData.value = "This is not a fact"
    }
}