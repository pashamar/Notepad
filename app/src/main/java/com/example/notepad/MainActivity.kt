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