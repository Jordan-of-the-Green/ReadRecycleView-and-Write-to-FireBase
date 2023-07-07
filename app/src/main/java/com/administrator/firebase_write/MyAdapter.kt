/***************************************************************************************
 *    Title: <Firebase Data to RecyclerView using Kotlin | Retrieve Firebase data into RecyclerView | Kotlin |>
 *    Author: <Foxandroid>
 *    Date Published: <19 April 2021>
 *    Date Retrieved: <04 June 2023>
 *    Code version: <1.0.0>
 *    Availability: <https://www.youtube.com/watch?v=VVXKVFyYQdQ>
 *
 ***************************************************************************************/


package com.administrator.firebase_write

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.administrator.firebase_write.R


class MyAdapter(private val userList : List<User>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = userList[position]
        holder.name1.text = currentItem.name
        holder.category1.text = currentItem.category
        holder.date1.text = currentItem.date
        holder.startTimes1.text = currentItem.startTimes
        holder.endTimes1.text = currentItem.endTimes
        holder.description1.text = currentItem.description
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class MyViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val name1: TextView = itemView.findViewById(R.id.name)
        val category1: TextView = itemView.findViewById(R.id.category)
        val date1: TextView = itemView.findViewById(R.id.date)
        val startTimes1: TextView = itemView.findViewById(R.id.starttimes)
        val endTimes1: TextView = itemView.findViewById(R.id.endtimes)
        val description1: TextView = itemView.findViewById(R.id.description)
    }
}