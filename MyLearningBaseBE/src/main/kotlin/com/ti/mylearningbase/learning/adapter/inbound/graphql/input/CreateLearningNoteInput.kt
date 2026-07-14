package com.ti.mylearningbase.learning.adapter.inbound.graphql.input

import com.ti.mylearningbase.learning.domain.Difficulty

data class CreateLearningNoteInput(
    val technologyId: Long,
    val title: String,
    val summary: String?,
    val content: String,
    val difficulty: Difficulty
)