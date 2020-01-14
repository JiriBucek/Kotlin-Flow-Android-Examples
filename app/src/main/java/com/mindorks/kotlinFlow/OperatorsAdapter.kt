package com.mindorks.kotlinFlow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_button.view.*

class OperatorsAdapter(
    private val activityList: List<Class<out AppCompatActivity>>,
    private val onClick: (Class<out AppCompatActivity>) -> Unit
) : RecyclerView.Adapter<OperatorsAdapter.ViewHolder>() {

    class ViewHolder(item: View) : RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.row_button,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = activityList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.run {
            val clazz = activityList[position]
            rowBtn.text = clazz.simpleName
            rowBtn.setOnClickListener {
                onClick(clazz)
            }
        }
    }
}