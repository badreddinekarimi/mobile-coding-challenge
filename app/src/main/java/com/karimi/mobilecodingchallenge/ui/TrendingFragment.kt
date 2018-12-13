package com.karimi.mobilecodingchallenge.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.karimi.mobilecodingchallenge.R

class TrendingFragment: Fragment(){

    val TAG = "TrendingFragment"

    lateinit var recyclerView: RecyclerView

    lateinit var adapter: TrendingAdapter

    companion object {
        fun newInstance(): TrendingFragment {
            return TrendingFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        writeToLog("onCreateView()")

        return inflater.inflate(R.layout.fragment_trending, container, false)
    }

    override fun onStart() {
        super.onStart()
        writeToLog("onStart()")

        init()
    }

    fun init() {
        writeToLog("init()")

        recyclerView = view?.findViewById(R.id.rvRepositories) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)

        //creating our adapter
        adapter = TrendingAdapter(ArrayList())

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter

        //load data
        loadRepositories()
    }

    fun loadRepositories() {
        writeToLog("loadRepositories")

        adapter.repositoriesList = ArrayList()
        adapter.notifyDataSetChanged()

        adapter.onItemClick = {
            Log.e(TAG, "adapter.onItemClick : " + it.name)
        }
    }

    fun writeToLog(str: String){
        Log.e(TAG, str)
    }
}