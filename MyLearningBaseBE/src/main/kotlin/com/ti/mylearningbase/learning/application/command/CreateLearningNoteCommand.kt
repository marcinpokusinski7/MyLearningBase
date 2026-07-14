package com.ti.mylearningbase.learning.application.command

import com.ti.mylearningbase.learning.domain.Difficulty

data class CreateLearningNoteCommand(
    val technologyId: Long,
    val title: String,
    val content: String,
    val difficulty: Difficulty
)