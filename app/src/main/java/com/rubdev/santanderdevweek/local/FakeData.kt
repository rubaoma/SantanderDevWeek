package com.rubdev.santanderdevweek.local

import com.rubdev.santanderdevweek.data.Cartao
import com.rubdev.santanderdevweek.data.Cliente
import com.rubdev.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData(): Conta {
        val cliente = Cliente("Olá, Rubens")
        val cartao = Cartao("4567")

      return Conta(
            "Cc 456734-5",
            "Ag 1234",
            "R$ 23.000,00",
            "R$ 30.000,00",
            cliente,
            cartao
        )
    }
}