package com.rubdev.santanderdevweek.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.rubdev.santanderdevweek.R
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


    }

    private fun initBinding() {
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.buscarContaCliente().observe(this, { result ->
            Log.d("Agencia", result.agencia)
            binding.apply {
                tvAgencia.text = result.agencia
                tvConta.text = result.numero
                tvSaldo.text = result.saldo
                tvSaldoLimite.text = result.limite
                tvUsuario.text = result.cliente.nome
                tvCartaoFinalNumero.text = result.cartao.numeroConta
            }
        })
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