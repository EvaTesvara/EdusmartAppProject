package com.example.edusmart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentTransaction

class FragmentDaftarBabFisika : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_daftar_bab_fisika, container, false)

        val buttonKembali = view.findViewById<ImageButton>(R.id.btn_back)
        val toFisikaBab1 = view.findViewById<CardView>(R.id.fisikaBab1)

        toFisikaBab1.setOnClickListener(View.OnClickListener {

            val fl:ConstraintLayout = view.findViewById(R.id.FragmentBabMateri)
            fl.removeAllViews()

            val fragmentfisikabab1 : Fragment = FragmentIsiBabFisika()
            val fmn: FragmentTransaction? =
                getActivity()?.getSupportFragmentManager()?.beginTransaction()
            fmn?.replace(R.id.FragmentBabMateri, fragmentfisikabab1)?.commit()
            fmn?.addToBackStack(null)
        })


        buttonKembali.setOnClickListener(View.OnClickListener {
            val fragmentJadwalPelajaran: Fragment = FragmentJadwalPelajaran()
            val fmn: FragmentTransaction? =
                getActivity()?.getSupportFragmentManager()?.beginTransaction()
            fmn?.replace(R.id.FragmentBabMateri, fragmentJadwalPelajaran)?.commit()
            fmn?.addToBackStack(null)


        })

        return view

    }
}

