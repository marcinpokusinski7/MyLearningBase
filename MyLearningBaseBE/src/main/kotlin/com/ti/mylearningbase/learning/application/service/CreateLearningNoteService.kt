package com.ti.mylearningbase.learning.application.service

import com.ti.mylearningbase.learning.application.command.CreateLearningNoteCommand
import com.ti.mylearningbase.learning.application.port.input.CreateLearningNoteUseCase
import com.ti.mylearningbase.learning.application.port.output.LearningNoteRepository
import com.ti.mylearningbase.learning.domain.LearningNote
import org.springframework.stereotype.Service

@Service
class CreateLearningNoteService(
    private val learningNoteRepository: LearningNoteRepository
) : CreateLearningNoteUseCase {
    override fun create(command: CreateLearningNoteCommand): LearningNote {
        val note = LearningNote.create(
            technologyId = command.technologyId,
            title = command.title,
            summary = command.summary,
            content = command.content,
            difficulty = command.difficulty
        )
        return learningNoteRepository.save(note)
    }

}