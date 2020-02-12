package com.example.motionlayoutkotlin.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayoutkotlin.R
import com.example.motionlayoutkotlin.model.Hobbies
import com.example.motionlayoutkotlin.showToast
import kotlinx.android.synthetic.main.single_cardview.view.*

class HobbiesAdapter(val context: Context, val list: List<Hobbies>) :
    RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view: View =
            LayoutInflater.from(context).inflate(R.layout.single_cardview, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = list[position]
        holder.setData(hobby, position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var hobby: String? = null
        fun setData(hobby: Hobbies?, position: Int) {
            itemView.titleText.text = hobby!!.name
            this.hobby = hobby.name
        }

        init {
            itemView.setOnClickListener({
                context.showToast(hobby);
            })
        }

        var textView: TextView = itemView.titleText

    }
}