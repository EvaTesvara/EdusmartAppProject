package com.example.edusmart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Home2Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home2Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var recyclerView : RecyclerView? = null
    private var recyclerViewSubScoreAdapter : RecyclerViewSubScoreAdapter? = null
    private var subscoreList = mutableListOf<SubScore>()

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

        val v = inflater.inflate(R.layout.fragment_home2, container, false)

        subscoreList = ArrayList()

        recyclerView = v.findViewById<View>(R.id.rvSubScoreList) as RecyclerView
        recyclerViewSubScoreAdapter = RecyclerViewSubScoreAdapter(this@Home2Fragment, subscoreList)
        val  layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(context)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewSubScoreAdapter

        prepareScoreListData()

        return v
    }

    private fun prepareScoreListData(){
        var subscore = SubScore("Tugas 1", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = SubScore("Ulangan Harian 1", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = SubScore("Tugas 2", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = SubScore("UTS", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = SubScore("UAS", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = SubScore("Ujian Praktik", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = SubScore("Kehadiran", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = SubScore("Sikap", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = SubScore("Tambahan", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = SubScore("Konsistensi", R.drawable.home_1)
        subscoreList.add(subscore)
        subscore = SubScore("Nilai Akhir", R.drawable.home_1)
        subscoreList.add(subscore)

        recyclerViewSubScoreAdapter!!.notifyDataSetChanged()

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Home2Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Home2Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}