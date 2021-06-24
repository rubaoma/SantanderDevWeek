package com.rubdev.santanderdevweek.local

import com.rubdev.santanderdevweek.data.Cartao
import com.rubdev.santanderdevweek.data.Cliente
import com.rubdev.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData(): Conta {
        val cliente = Cliente("Rubens Moura")
        val cartao = Cartao("4567")

      return Conta(
            "456734-5",
            "1234",
            "23.345,00",
             "30.000,00",
            cliente,
            cartao
        )
    }
}