package com.satyam.swipenotes

data class Note (
    val id: Long = System.currentTimeMillis(),
    val title: String,
    val content: String,
    val createdAt: Long = System.currentTimeMillis()
)