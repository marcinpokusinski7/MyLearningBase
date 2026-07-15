package com.ti.mylearningbase.learning.application.service

import com.ti.mylearningbase.learning.application.port.input.GetLearningNoteUseCase
import com.ti.mylearningbase.learning.application.port.output.LearningNoteRepository
import com.ti.mylearningbase.learning.domain.LearningNote
import org.springframework.stereotype.Service

@Service
class GetLearningNoteService(
    private val learningNoteRepository: LearningNoteRepository
) : GetLearningNoteUseCase {

    override fun findById(id: Long): LearningNote? =
        learningNoteRepository.findById(id)
}