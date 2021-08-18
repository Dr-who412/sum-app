package com.example.sumapp
import android.widget.Toast

class Toast(toasttext:String,context:MainActivity){
    init {
        Toast.makeText(context, toasttext, Toast.LENGTH_SHORT).show()

    }


}