package com.karimi.mobilecodingchallenge.models

data class Response(
    val total_count: Int,
    val incomplete_results: Boolean,
    val items: List<Item>
)