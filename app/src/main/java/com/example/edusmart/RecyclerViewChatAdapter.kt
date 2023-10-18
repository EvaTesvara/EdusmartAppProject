package com.example.edusmart

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewChatAdapter constructor(private val getActivity: FragmentChat, private val chatList: List<Chat>) :
    RecyclerView.Adapter<RecyclerViewChatAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_chat_list_item, parent, false)
        return MyViewHolder(view)


    }

    override fun getItemCount(): Int {
        return chatList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvChatTitle.text = chatList[position].title
        holder.ivChatImg.setImageResource(chatList[position].image)



        holder.cardView.setOnClickListener {

            val fragmentTransaction = getActivity.parentFragmentManager.beginTransaction()
            val targetFragment = Chat1Fragment()
            fragmentTransaction.replace(R.id.fragmentContainerView4, targetFragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

//        holder.cardView.setOnClickListener {
//            Toast.makeText(getActivity, scoreList[position].title, Toast.LENGTH_LONG).show()
//        }
    }

    class MyViewHolder(itemView : View)  : RecyclerView.ViewHolder(itemView){
        val tvChatTitle : TextView = itemView.findViewById(R.id.tv_ChatTitle)
        val ivChatImg : ImageView = itemView.findViewById(R.id.ivChatImg)
        val cardView : CardView = itemView.findViewById(R.id.cardView)
    }
}