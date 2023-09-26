package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(private val numbers: List<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {

    //Step 3b: Complete function definitions for adapter

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder = NumberViewHolder(TextView(parent.context))

    override fun getItemCount(): Int = numbers.size

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text = numbers[position].toString()
    }

}