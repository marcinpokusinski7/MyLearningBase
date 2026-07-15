package com.ti.mylearningbase.learning.domain

data class LearningNote(
    val id: Long?,
    val technologyId: Long,
    val title: String,
    val summary: String?,
    val content: String,
    val difficulty: Difficulty
) {

    companion object {
        fun create(
            technologyId: Long,
            title: String,
            summary: String?,
            content: String,
            difficulty: Difficulty
        ): LearningNote {
            require(title.isNotBlank()) {
                "Learning note title cannot be blank"
            }
            require(content.isNotBlank()) {
                "Learning note content cannot be blank"
            }
            return LearningNote(
                id = null,
                technologyId = technologyId,
                title = title.trim(),
                summary = summary?.trim(),
                content = content.trim(),
                difficulty = difficulty
            )
        }

    }
}