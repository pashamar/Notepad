package com.example.notepad

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

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
    lateinit var mAddImageBtn:ImageView;
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList : ArrayList<GeneralFragment>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view:View = inflater.inflate(R.layout.fragment_general, container, false)
        initView(view)

        return  view
    }

    fun initView(view:View){
        mAddImageBtn = view.findViewById(R.id.imageAddNoteMain)

        newRecyclerView = view.findViewById(R.id.notesRycyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.VERTICAL, false);
       val notesList:  ArrayList<Notes> = ArrayList<Notes>()
        notesList.add(Notes(0, "Купить хлеб", "В пятерочке"))
        var list:ArrayList<Int> = ArrayList();

        //Размер
        list.size
        //Добавить
        list.add(0)
        list.add(1)
        for(n in 2..100){
            list.add(n)
        }
        //Получить по индексу
        val a:Int = 20
        //Object методы
        a.hashCode()
        a.toString()
        if(a.equals(10)){

        }else{

        }


        newRecyclerView.adapter = MyAdapter(list);
        newRecyclerView.setHasFixedSize(true)

       // newArrayList = arrayListOf<GeneralFragment>()
        mAddImageBtn.setOnClickListener {
            createNote();
        }
    }

    fun createNote(){

        (requireActivity() as MainActivity).setFragmentOnScreen(CreateNoteFragment());

    }




}