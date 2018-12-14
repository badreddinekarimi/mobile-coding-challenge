package com.karimi.mobilecodingchallenge.utils

import java.text.SimpleDateFormat
import java.util.*




class Utility {

    companion object {

        // 30 days before today date
        fun get30DaysAgoDate(): String{

            val curFormater = SimpleDateFormat("yyyy-MM-dd")
            val date = Date(Calendar.getInstance().time.getTime() - 2592000000L) // 30 days before : 30 * 24 * 60 * 60 * 1000
            val dateString = curFormater.format(date)

            return dateString
        }
    }
}