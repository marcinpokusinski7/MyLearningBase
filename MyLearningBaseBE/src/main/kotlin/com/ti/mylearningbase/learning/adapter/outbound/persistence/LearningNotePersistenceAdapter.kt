package com.ti.mylearningbase.learning.adapter.outbound.persistence

import com.ti.mylearningbase.learning.application.port.output.LearningNoteRepository
import com.ti.mylearningbase.learning.domain.LearningNote
import org.springframework.stereotype.Repository

@Repository
class LearningNotePersistenceAdapter(
    private val jpaRepository: LearningNoteJpaRepository,
    private val mapper: LearningNotePersistenceMapper
) : LearningNoteRepository {

    override fun save(note: LearningNote): LearningNote {
        val entity = mapper.toEntity(note)
        val savedEntity = jpaRepository.save(entity)
        return mapper.toDomain(savedEntity)
    }

    override fun findById(id: Long): LearningNote? =
        jpaRepository.findById(id)
            .map(mapper::toDomain)
            .orElse(null)
}