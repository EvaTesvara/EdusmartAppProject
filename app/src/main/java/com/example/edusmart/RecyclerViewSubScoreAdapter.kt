package com.example.edusmart

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewSubScoreAdapter constructor(private val getActivity: Home2Fragment, private val subscoreList: List<SubScore>) :
    RecyclerView.Adapter<RecyclerViewSubScoreAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_subscore_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return subscoreList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvScoreTitle.text = subscoreList[position].title
        holder.ivScoreImg.setImageResource(subscoreList[position].image)

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