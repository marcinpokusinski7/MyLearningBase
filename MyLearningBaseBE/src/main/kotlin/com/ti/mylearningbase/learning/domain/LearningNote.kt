package com.ti.mylearningbase.learning.domain

data class LearningNote(
    val id: Long,
    val technologyId: Long,
    val title: String,
    val content: String,
    val difficulty: Difficulty
)