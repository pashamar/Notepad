package com.example.notepad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList : ArrayList<GeneralFragment>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setFragmentOnScreen(fr = GeneralFragment())



        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<GeneralFragment>()
        getUserdata()
    }

    private fun getUserdata() {

        for(i in imageId.indices){

            val GeneralFragment = GeneralFragment(imageId[i],heading[i])
            newArrayList.add(GeneralFragment())

        }

        newRecyclerView.adapter = MyAdapter(newArrayList)
    }


    override fun onStart() {
        super.onStart()
    }

    //запустили

    override fun onResume() {
        super.onResume()
    }

    //пауза
    override fun onPause() {
        super.onPause()
    }

    //Вернулся
    override fun onRestart() {
        super.onRestart()
    }

    //Приостановлено
    override fun onStop() {
        super.onStop()
    }

    //Активити уничтожено
    override fun onDestroy() {

        super.onDestroy()
    }











    fun setFragmentOnScreen(fr:Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container_view_tag,
            fr).commit()
    }




}