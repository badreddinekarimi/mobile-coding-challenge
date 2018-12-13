package com.karimi.mobilecodingchallenge.ui

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.karimi.mobilecodingchallenge.R
import com.karimi.mobilecodingchallenge.models.Item


class TrendingAdapter(var repositoriesList: ArrayList<Item>) : RecyclerView.Adapter<TrendingAdapter.ViewHolder>() {

    val TAG = "MealsAdapter"
    var onItemClick: ((Item) -> Unit)? = null

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

        @SuppressLint("SetTextI18n")
        fun bindItems(item: Item) {
            val repo_name = itemView.findViewById(R.id.label_repo_name) as TextView
            val repo_desc = itemView.findViewById(R.id.label_repo_desc) as TextView
            val repo_owner_name = itemView.findViewById(R.id.label_repo_owner_name) as TextView
            val number_of_stars = itemView.findViewById(R.id.label_number_of_stars) as TextView
            val img_owner = itemView.findViewById(R.id.img_owner) as ImageView

            repo_name.text = item.name
            repo_desc.text = item.description
            repo_owner_name.text = item.owner.login

            if(item.stargazers_count>1000)
                number_of_stars.text = (item.stargazers_count/1000).toString() + "k"
            else
                number_of_stars.text = item.stargazers_count.toString()

            Glide.with(context)
                .load(item.owner.avatar_url)
                .into(img_owner)
        }


    }

}