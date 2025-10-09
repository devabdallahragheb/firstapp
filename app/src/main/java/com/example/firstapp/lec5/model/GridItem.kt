package com.example.firstapp.lec5.model

data class GridItem(
    val id: Int,
    val title: String,
    val imageUrl: String, // Changed from imageUrl to imageRes for drawable resources
    val description: String? = null
)
