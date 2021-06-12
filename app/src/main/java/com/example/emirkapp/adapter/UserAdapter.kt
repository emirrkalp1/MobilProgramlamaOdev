package com.example.emirkapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.emirkapp.R
import com.example.emirkapp.data.model.User
import com.example.emirkapp.adapter.UserAdapter.UserViewHolder
import kotlinx.android.synthetic.main.item_layout.view.*

class UserAdapter (private val users: ArrayList<User>): RecyclerView.Adapter<UserViewHolder>() {

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        fun bind(user:User)
        {
            itemView.apply {
                textViewUserName.text = user.name
                textViewUserName.text = user.id
                textViewUserName.text = user.email
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder = UserViewHolder(LayoutInflater.from(parent.context).inflate(
        R.layout.item_layout, parent, false))

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount(): Int = users.size
}