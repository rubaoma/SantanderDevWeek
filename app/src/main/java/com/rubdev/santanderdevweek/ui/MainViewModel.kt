package com.rubdev.santanderdevweek.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rubdev.santanderdevweek.data.Conta
import com.rubdev.santanderdevweek.local.FakeData

class MainViewModel: ViewModel() {

    private val multableLiveData: MutableLiveData<Conta> = MutableLiveData()

    fun buscarContaCliente(): LiveData<Conta>{
        multableLiveData.value = FakeData().getLocalData()

        return multableLiveData
    }
}