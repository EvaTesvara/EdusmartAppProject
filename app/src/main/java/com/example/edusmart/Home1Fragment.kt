package com.example.edusmart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Home1Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home1Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var recyclerView : RecyclerView? = null
    private var recyclerViewScoreAdapter : RecyclerViewScoreAdapter? = null
    private var scoreList = mutableListOf<Score>()


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
        var v = inflater.inflate(R.layout.fragment_home1, container, false)
        val x = inflater.inflate(R.layout.layout_score_list_item, container, false)


        scoreList = ArrayList()

        recyclerView = v.findViewById<View>(R.id.rvScoreList) as RecyclerView
        recyclerViewScoreAdapter = RecyclerViewScoreAdapter(this@Home1Fragment, scoreList)
        val  layoutManager : RecyclerView.LayoutManager = GridLayoutManager(context, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewScoreAdapter

        prepareScoreListData()


//         fail to setup onclick fragment recyclerview
//        val bt = x.findViewById<ImageView>(R.id.ivScoreImg)
//        bt.setOnClickListener{
//            val home2Fragment = Home2Fragment()
//            val transaction : FragmentTransaction = requireFragmentManager().beginTransaction()
//            transaction.replace(R.id.fragment_container,home2Fragment)
//            transaction.addToBackStack(null)
//            transaction.commit()
//
//        }

        return v

    }

    private fun prepareScoreListData(){
        var score = Score("B.Indonesia", R.drawable.home_1)
        scoreList.add(score)
        score = Score("Biologi", R.drawable.home_1)
        scoreList.add(score)
        score = Score("Matematika", R.drawable.home_1)
        scoreList.add(score)
        score = Score("Fisika", R.drawable.home_1)
        scoreList.add(score)
        score = Score("Kimia", R.drawable.home_1)
        scoreList.add(score)
        score = Score("B.Inggris", R.drawable.home_1)
        scoreList.add(score)
        score = Score("B.Prancis", R.drawable.home_1)
        scoreList.add(score)
        score = Score("Sejarah", R.drawable.home_1)
        scoreList.add(score)
        score = Score("Sosiologi", R.drawable.home_1)
        scoreList.add(score)
        score = Score("Kesenian", R.drawable.home_1)
        scoreList.add(score)
        score = Score("Jasmani", R.drawable.home_1)
        scoreList.add(score)

        recyclerViewScoreAdapter!!.notifyDataSetChanged()

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Home1Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Home1Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}