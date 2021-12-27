package com.abora.learndiffutil

import android.view.View
import androidx.recyclerview.widget.RecyclerView

// Model class
data class User(val name: String, val age: Int)

// ViewHolder
class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    fun bind(user: User){
        // use the model to bind data to the views
    }
}

//https://medium.com/geekculture/android-listadapter-a-better-implementation-for-the-recyclerview-1af1826a7d21