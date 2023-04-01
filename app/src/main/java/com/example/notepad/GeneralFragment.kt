package com.example.notepad

import android.os.Bundle
import android.provider.DocumentsContract.Root
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GeneralFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GeneralFragment : Fragment() {
    lateinit var mAddImageBtn:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View = inflater.inflate(R.layout.fragment_general, container, attachToRoot: false)
        initView(view)
        return view;
    }

    fun initView(view: View){
        mAddImageBtn = view.findViewById(R.id.imageAddNoteMain)
        mAddImageBtn.setOnClickListener { it:View!
                createNote();

        }

}

fun createNote(){
    (requireActivity() as MainActivity).setFragmentOnScreen(CreateFragment());

}



