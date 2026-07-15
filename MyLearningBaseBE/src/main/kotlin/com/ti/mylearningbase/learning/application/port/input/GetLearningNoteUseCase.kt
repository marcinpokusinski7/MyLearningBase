package com.ti.mylearningbase.learning.application.port.input

import com.ti.mylearningbase.learning.domain.LearningNote

interface GetLearningNoteUseCase {
    fun findById(id: Long): LearningNote?
}