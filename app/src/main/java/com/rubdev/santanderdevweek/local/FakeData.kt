package com.rubdev.santanderdevweek.local

import com.rubdev.santanderdevweek.data.Cartao
import com.rubdev.santanderdevweek.data.Cliente
import com.rubdev.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData(): Conta {
        val cliente = Cliente("Rubens Moura")
        val cartao = Cartao("3456123467894567")

      return Conta(
            "456734-5",
            "1234",
            "23000",
            "30000",
            cliente,
            cartao
        )
    }
}