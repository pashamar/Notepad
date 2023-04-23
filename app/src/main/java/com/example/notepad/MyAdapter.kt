package com.example.notepad

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import java.util.*

class MyAdapter(private val newList : ArrayList<Notes>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if(viewType == 0){
            val itemItem:View = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
                parent, false)
            MyViewHolder(itemView = itemItem)
        }else{
            val itemItem:View = LayoutInflater.from(parent.context).inflate(R.layout.list_item_second,
                parent, false)
            MyViewHolderSecond(itemView = itemItem)
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is MyViewHolder){
            holder.bindFirst(newList[position])
        }
        if(holder is MyViewHolderSecond){
            holder.bindSecond(newList[position])
        }

    }

    override fun getItemCount(): Int {
      return newList.size
    }

    override fun getItemViewType(position: Int): Int {
        return if(newList[position].titleImage.isEmpty()){
            1;
        }else{
            0;
        }
    }



    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        lateinit var mTitleText:TextView
        lateinit var mDescriptionText:TextView
        lateinit var mTitleImage: ShapeableImageView

        fun bindFirst(item:Notes){
            initView();
            mTitleText.text = item.heading
            mDescriptionText.text = item.description
            mTitleImage.setImageURI(Uri.parse(item.titleImage));

        }

        fun initView(){
            mTitleText = itemView.findViewById(R.id.Heading)
            mDescriptionText = itemView.findViewById(R.id.description)
            mTitleImage = itemView.findViewById(R.id.title_image)
        }
    }

    class MyViewHolderSecond(itemView : View) : RecyclerView.ViewHolder(itemView){
        lateinit var mTitleText:TextView
        lateinit var mDescriptionText:TextView

        fun bindSecond(item:Notes){
            initView();
            mTitleText.text = item.heading
            mDescriptionText.text = item.description


        }

        fun initView(){
            mTitleText = itemView.findViewById(R.id.Heading)
            mDescriptionText = itemView.findViewById(R.id.description)
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