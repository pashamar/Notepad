package com.example.notepad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setFragmentOnScreen(fr = GeneralFragment())
    }

    fun setFragmentOnScreen(fr: Fragment){
        supportFragmentManager.beginTransaction().replace(androidx.fragment.R.id.fragment_container_view_tag,
            fr).commit()



    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

}