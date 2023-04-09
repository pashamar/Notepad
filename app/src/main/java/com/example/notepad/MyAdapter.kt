package com.example.notepad

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MyAdapter(private val newList : ArrayList<Int>)
    : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemItem:View = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
            parent, false)
        return  MyViewHolder(itemView = itemItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
      holder.bind(newList[position])
        //1, 2, 3, 4, 5, 6
        //0, 1, 2, 3, 4, 5

    }

    override fun getItemCount(): Int {
      return newList.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        lateinit var mTitleText:TextView

        fun bind(item:Int){
            mTitleText = itemView.findViewById(R.id.Heading)
            mTitleText.setText("Элемент с номером ${item}")

        }

    }



}





/*
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

 */