package com.ti.mylearningbase.learning.adapter.outbound.persistence

import com.ti.mylearningbase.learning.domain.LearningNote
import org.springframework.stereotype.Component

@Component
class LearningNotePersistenceMapper {

    fun toEntity(note: LearningNote): LearningNoteEntity =
        LearningNoteEntity(
            id = note.id,
            technologyId = note.technologyId,
            title = note.title,
            summary = note.summary,
            content = note.content,
            difficulty = note.difficulty
        )

    fun toDomain(entity: LearningNoteEntity): LearningNote =
        LearningNote(
            id = entity.id,
            technologyId = entity.technologyId,
            title = entity.title,
            summary = entity.summary,
            content = entity.content,
            difficulty = entity.difficulty
        )
}