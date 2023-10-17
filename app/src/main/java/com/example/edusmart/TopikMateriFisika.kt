package com.example.edusmart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageButton
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentTransaction

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TopikMateriFisika.newInstance] factory method to
 * create an instance of this fragment.
 */
class TopikMateriFisika : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_topik_materi_fisika, container, false)

        val backButton = view.findViewById<ImageButton>(R.id.btn_back)
        val btnToMateri = view.findViewById<CardView>(R.id.cardViewMateri)

        btnToMateri.setOnClickListener(View.OnClickListener {

            val fl: ConstraintLayout = view.findViewById(R.id.TopikMateriFisika)
            fl.removeAllViews()

            val fragmentMateriFisika: Fragment = MateriFisika()
            val fmn: FragmentTransaction? = getActivity()?.getSupportFragmentManager()?.beginTransaction()
            fmn?.replace(R.id.TopikMateriFisika, fragmentMateriFisika)?.commit()
        })

        backButton.setOnClickListener(View.OnClickListener {
            val fragmentBabMateri: Fragment = FragmentBabMateri()
            val fmn: FragmentTransaction? =
                getActivity()?.getSupportFragmentManager()?.beginTransaction()
            fmn?.replace(R.id.FragmentBabMateri, fragmentBabMateri)?.commit()
            fmn?.addToBackStack(null)


        })

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment TopikMateriFisika.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TopikMateriFisika().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}