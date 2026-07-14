package com.ti.mylearningbase.learning.adapter.inbound.graphql.mapper

import com.ti.mylearningbase.learning.adapter.inbound.graphql.response.LearningNoteResponse
import com.ti.mylearningbase.learning.domain.LearningNote
import org.springframework.stereotype.Component

@Component
class LearningNoteGraphqlMapper {

    fun toLearningNoteResponse(note: LearningNote): LearningNoteResponse =
        LearningNoteResponse(
            id = requireNotNull(note.id),
            technologyId = note.technologyId,
            title = note.title,
            summary = note.summary,
            content = note.content,
            difficulty = note.difficulty,
        )
}