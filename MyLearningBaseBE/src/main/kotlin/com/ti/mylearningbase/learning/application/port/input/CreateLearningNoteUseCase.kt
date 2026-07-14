package com.ti.mylearningbase.learning.application.port.input

import com.ti.mylearningbase.learning.application.command.CreateLearningNoteCommand
import com.ti.mylearningbase.learning.domain.LearningNote

interface CreateLearningNoteUseCase {

    fun create(command: CreateLearningNoteCommand): LearningNote
    fun getById(id: Long): LearningNote
}