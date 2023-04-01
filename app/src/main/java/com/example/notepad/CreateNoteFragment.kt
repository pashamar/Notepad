package com.example.notepad

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class CreateNoteFragment : Fragment() {

    lateinit var mBtmBack:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View = inflater.inflate(R.layout.activity_create_note, container, attachToRoot: false)
        init(view)
        return view;
    }
    fun init(view:View){
    mBtmBack = view.findViewById(R.id.ImageBack)
        mBtmBack.setOnClickListener {
            goBack();

        }
    }

    fun goBack(){
        (requireActivity() as MainActivity).setFragmentOnScreen(GeneralFragment());

    }

}