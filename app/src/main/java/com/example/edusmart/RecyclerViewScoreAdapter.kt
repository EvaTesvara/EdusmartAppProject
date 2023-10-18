package com.example.edusmart

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewScoreAdapter constructor(private val getActivity: Home1Fragment, private val scoreList: List<Score>) :
    RecyclerView.Adapter<RecyclerViewScoreAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_score_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return scoreList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvScoreTitle.text = scoreList[position].title
        holder.ivScoreImg.setImageResource(scoreList[position].image)

        holder.cardView.setOnClickListener {
            val fragmentTransaction = getActivity.parentFragmentManager.beginTransaction()
            val targetFragment = Home2Fragment()
            fragmentTransaction.replace(R.id.fragmentContainerView4, targetFragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }


//        holder.cardView.setOnClickListener {
//            Toast.makeText(getActivity, scoreList[position].title, Toast.LENGTH_LONG).show()
//        }
    }

    class MyViewHolder(itemView : View)  : RecyclerView.ViewHolder(itemView){
        val tvScoreTitle : TextView = itemView.findViewById(R.id.tv_ScoreTitle)
        val ivScoreImg : ImageView = itemView.findViewById(R.id.ivScoreImg)
        val cardView : CardView = itemView.findViewById(R.id.cardView)
    }
}