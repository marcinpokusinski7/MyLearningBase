package com.ti.mylearningbase.learning.adapter.inbound.graphql.response

import com.ti.mylearningbase.learning.domain.Difficulty

data class LearningNoteResponse(
    val id: Long,
    val technologyId: Long,
    val title: String,
    val summary: String?,
    val content: String,
    val difficulty: Difficulty
)