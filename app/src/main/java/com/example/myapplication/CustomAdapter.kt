package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val userList: ArrayList<User>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val TYPE_HEADER = 0
    private val TYPE_ITEM = 1
    private val TYPE_FOOTER = 2
    //this method is returning the view for each item in the list

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == TYPE_HEADER) {
            val header = LayoutInflater.from(parent.context).inflate(R.layout.header, parent, false)
            return HeaderViewHolder(header)
        } else if (viewType == TYPE_ITEM) {
            val item =
                LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
            return ItemViewHolder(item)
        } else {
            val footer = LayoutInflater.from(parent.context).inflate(R.layout.footer, parent, false)
            return FooterViewHolder(footer)
        }
    }
//

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is ItemViewHolder) {
            holder.bindItems(userList[position - 1])
        }
    }

    //this method is giving the size of the list
    override fun getItemCount()
            : Int {
        return userList.size + 2
    }

    override fun getItemViewType(position: Int)
            : Int {
        return if (position == 0) TYPE_HEADER else if (position == userList.size + 1) TYPE_FOOTER else TYPE_ITEM
    }

    //the class is hodling the list view
    internal class HeaderViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView)

    internal class FooterViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView)

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(user: User) {
            val textViewName = itemView.findViewById(R.id.textViewUsername) as TextView
            val textViewAddress = itemView.findViewById(R.id.textViewAddress) as TextView
            textViewName.text = user.name
            textViewAddress.text = user.address
        }
    }
}

