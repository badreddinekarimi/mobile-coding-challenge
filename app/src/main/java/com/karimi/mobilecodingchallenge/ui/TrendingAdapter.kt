package com.karimi.mobilecodingchallenge.ui

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.karimi.mobilecodingchallenge.R
import com.karimi.mobilecodingchallenge.models.Repository


class TrendingAdapter(var repositoriesList: ArrayList<Repository>) : RecyclerView.Adapter<TrendingAdapter.ViewHolder>() {

    val TAG = "MealsAdapter"
    var onItemClick: ((Repository) -> Unit)? = null

    lateinit var context: Context

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        Log.e(TAG, "onCreateViewHolder")

        context = p0.context
        val v = LayoutInflater.from(context).inflate(R.layout.cardview_repository, p0, false)
        return ViewHolder(v)
    }


    override fun getItemCount(): Int {
        return repositoriesList.size
    }


    override fun onBindViewHolder(holder: TrendingAdapter.ViewHolder, position: Int) {
        Log.e(TAG, "onBindViewHolder")

        holder.bindItems(repositoriesList[position])
    }

    //the class is hodling the list view
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val TAG2 = "MealsAdapter.ViewHolder"

        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(repositoriesList[adapterPosition])

            }
        }

        fun bindItems(repository: Repository) {

        }


    }

}