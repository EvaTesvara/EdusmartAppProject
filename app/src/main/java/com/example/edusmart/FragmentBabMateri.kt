package com.example.edusmart

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageButton
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class FragmentBabMateri : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_bab_materi, container, false)

        val buttonKembali = view.findViewById<ImageButton>(R.id.btn_back)
        val toFisikaBab1 = view.findViewById<CardView>(R.id.fisikaBab1)

        toFisikaBab1.setOnClickListener(View.OnClickListener {

            val fl:ConstraintLayout = view.findViewById(R.id.FragmentBabMateri)
            fl.removeAllViews()

            val fragmentfisikabab1 : Fragment = TopikMateriFisika()
            val fmn: FragmentTransaction? =
                getActivity()?.getSupportFragmentManager()?.beginTransaction()
            fmn?.replace(R.id.FragmentBabMateri, fragmentfisikabab1)?.commit()
            fmn?.addToBackStack(null)
        })


        buttonKembali.setOnClickListener(View.OnClickListener {
            val fragmentMenuMateri: Fragment = FragmentMenuMateri()
            val fmn: FragmentTransaction? =
                getActivity()?.getSupportFragmentManager()?.beginTransaction()
            fmn?.replace(R.id.FragmentBabMateri, fragmentMenuMateri)?.commit()
            fmn?.addToBackStack(null)


        })

        return view

    }
}

