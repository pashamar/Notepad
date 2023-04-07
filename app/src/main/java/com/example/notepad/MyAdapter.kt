package com.example.notepad

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MyAdapter (private val newList : ArrayList<GeneralFragment>) : RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_general, container, false)
        init(view)
        return view;

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = newList[position]
        holder.titleImage.setImageResourse(currentItem.titleImage)
        holder.tvHeading.text = currentItem.heading


}
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){



    }



}