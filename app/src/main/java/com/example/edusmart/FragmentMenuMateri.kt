package com.example.edusmart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.findFragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

class FragmentMenuMateri : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_menu_materi, container, false)

        val buttonseninindo = view.findViewById<Button>(R.id.seninindo)
        buttonseninindo.setOnClickListener(View.OnClickListener {
            val fl:FrameLayout = view.findViewById(R.id.FragmentMenuMateri)
            fl.removeAllViews()

            val fragmentBabMateriIndo: Fragment = FragmentBabMateri()
            val fm: FragmentTransaction? =
                getActivity()?.getSupportFragmentManager()?.beginTransaction()
            fm?.replace(R.id.FragmentMenuMateri, fragmentBabMateriIndo)?.commit()

        })

        val buttonsenininggris = view.findViewById<Button>(R.id.senininggris)
        buttonsenininggris.setOnClickListener(View.OnClickListener {
            val fl:FrameLayout = view.findViewById(R.id.FragmentMenuMateri)
            fl.removeAllViews()
            val fragmentBabMateriInggris: Fragment = FragmentBabMateriInggris()
            val fm: FragmentTransaction? =
                getActivity()?.getSupportFragmentManager()?.beginTransaction()
            fm?.addToBackStack(null)
            fm?.replace(R.id.FragmentMenuMateri, fragmentBabMateriInggris)?.commit()

        })


        return view

    }
}




