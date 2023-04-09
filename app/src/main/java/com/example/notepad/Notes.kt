package com.example.notepad

import java.util.*

data class Notes(val titleImage : Int, val heading : String, val description:String)

class NoteNoData(private val newList : ArrayList<Int>){

    override fun toString(): String {
        super.toString()
        return "NOTE NO DATA"
    }

    override fun hashCode(): Int {
        return newList.hashCode()
    }

}
