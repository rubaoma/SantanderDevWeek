package com.rubdev.santanderdevweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.rubdev.santanderdevweek.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setSupportActionBar(findViewById(R.id.toolbar))

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       return when(item.itemId){
           R.id.menu_1 -> {
//               binding.tvTexto.text = getString(R.string.menu_1_text)
               Log.d("CLICK", "Menu 1 selecionado")
                true
           }
//           R.id.item_2 -> {
////               binding.tvTexto.text = getString(R.string.menu_2_text)
//               Log.d("CLICK", "Menu 2 selecionado")
//               true
//           }
           else -> super.onOptionsItemSelected(item)
       }

    }


}