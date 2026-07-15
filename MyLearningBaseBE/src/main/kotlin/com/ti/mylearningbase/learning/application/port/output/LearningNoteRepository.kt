package com.ti.mylearningbase.learning.application.port.output

import com.ti.mylearningbase.learning.domain.LearningNote

interface LearningNoteRepository {
    fun save(note: LearningNote): LearningNote
    fun findById(id: Long): LearningNote?
}