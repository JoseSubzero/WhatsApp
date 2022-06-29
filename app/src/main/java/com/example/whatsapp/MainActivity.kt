package com.example.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.whatsapp.Fragments.FirstFragment
import com.example.whatsapp.Fragments.SecondFragment
import com.example.whatsapp.Fragments.ThirdFragment
import com.example.whatsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object{
        private val ID_NUEVO_GRUPO = Menu.FIRST
        private val ID_NUEVA_DIFUSION = Menu.FIRST + 1
        private val ID_DISPOSITIVOS_VINCULADOS = Menu.FIRST + 2
        private val ID_MENSAJES_DESTACADOS = Menu.FIRST + 3
        private val ID_AJUSTES = Menu.FIRST + 4
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar

        actionBar!!.title = "  WhatsApp"

        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)

//        setSupportActionBar(binding.toolbar)


        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setDisplayUseLogoEnabled(true)

        val fragment1 = FirstFragment()
        val fragment2 = SecondFragment()
        val fragment3 = ThirdFragment()

        binding.btnFrag1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, fragment1)
                addToBackStack(null)
                commit()
            }
        }
        binding.btnFrag2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, fragment2)
                addToBackStack(null)
                commit()
            }
        }
        binding.btnFrag3.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,fragment3)
                addToBackStack(null)
                commit()
            }
        }
        binding.btnFrag1.setOnClickListener {  supportFragmentManager.beginTransaction()
            .addToBackStack(null).setCustomAnimations(
                R.anim.slide_in,
                R.anim.fade_out,
                R.anim.fade_in,
                R.anim.slide_out
            )
            .replace(R.id.fragmentContainerView,fragment1)
            .commit()}

        binding.btnFrag2.setOnClickListener {supportFragmentManager.beginTransaction()
            .addToBackStack(null).setCustomAnimations(
                R.anim.slide_in,
                R.anim.fade_out,
                R.anim.fade_in,
                R.anim.slide_out
            )
            .replace(R.id.fragmentContainerView,fragment2)
            .commit()}

        binding.btnFrag3.setOnClickListener {supportFragmentManager.beginTransaction()
            .addToBackStack(null).setCustomAnimations(
                R.anim.slide_in,
                R.anim.fade_out,
                R.anim.fade_in,
                R.anim.slide_out
            )
            .replace(R.id.fragmentContainerView,fragment3)
            .commit()}
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.add(Menu.NONE, ID_NUEVO_GRUPO, Menu.NONE, "Nuevo grupo")
        menu.add(Menu.NONE, ID_NUEVA_DIFUSION, Menu.NONE, "Nueva difusión")
        menu.add(Menu.NONE, ID_DISPOSITIVOS_VINCULADOS, Menu.NONE, "Dispositivos vinculados")
        menu.add(Menu.NONE, ID_MENSAJES_DESTACADOS, Menu.NONE, "Mensajes destacados")
        menu.add(Menu.NONE, ID_AJUSTES, Menu.NONE, "Ajustes")
        menuInflater.inflate(R.menu.fragment_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

}

//#FF37be4A