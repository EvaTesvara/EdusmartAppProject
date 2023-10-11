package com.example.edusmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.edusmart.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(FragmentHome())

        binding.bottomNavigationView.setOnItemReselectedListener {

            when(it.itemId){
                R.id.home -> replaceFragment(FragmentHome())
                R.id.materi -> replaceFragment(FragmentMenuMateri())
                R.id.chat -> replaceFragment(FragmentChat())

                else ->{

                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}