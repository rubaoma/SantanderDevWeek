package com.rubdev.santanderdevweek.ui

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.rubdev.santanderdevweek.R
import com.rubdev.santanderdevweek.data.Conta
import com.rubdev.santanderdevweek.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setSupportActionBar(findViewById(R.id.toolbar))
        initBinding()

//        throw RuntimeException("Test crash")

    }

    private fun initBinding() {
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        searchClientAccount()
    }

    private fun searchClientAccount(){
        mainViewModel.buscarContaCliente().observe(this, { result ->
            bindOnView(result)
        })
    }

    private fun bindOnView(conta: Conta) {
        val clientName = setTextField(conta.cliente.nome, R.string.welcome_client)
        val agency = setTextField(conta.agencia, R.string.account_agency)
        val acountNumber = setTextField(conta.numero, R.string.account_number)
        val balance = setTextField(conta.saldo, R.string.saldo_conta)
        val limit = setTextField(conta.limite, R.string.valor_limite)
        val finalNumberCard = setTextField(conta.cartao.numeroConta, R.string.cartao_number_example)

        binding.apply {
            tvAgencia.text = agency
            tvConta.text = acountNumber
            tvSaldo.text = balance
            tvSaldoLimite.text = limit
            tvUsuario.text = clientName
            tvCartaoFinalNumero.text = finalNumberCard
//                tvCartaoFinalNumero.setTextSize(TypedValue.COMPLEX_UNIT_SP,24F)
        }
    }


    private fun setTextField(text: String, stringFont:Int): String {
        return getString(
            stringFont,
            text
        )
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_1 -> {
//               binding.tvTexto.text = getString(R.string.menu_1_text)
                Log.d("CLICK", "Menu 1 selecionado")
                true
            }
            R.id.menu_2 -> {
//               binding.tvTexto.text = getString(R.string.menu_2_text)
                Log.d("CLICK", "Menu 2 selecionado")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }


}